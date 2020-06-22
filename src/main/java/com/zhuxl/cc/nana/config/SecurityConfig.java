package com.zhuxl.cc.nana.config;

import com.zhuxl.cc.nana.model.domain.SysUser;
import com.zhuxl.cc.nana.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author: zhuxl
 * @Date: 2020/6/18
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/image/**", "/plugin/**", "/json/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .loginProcessingUrl("/doLogin")
            .failureUrl("/login?error=true")
            .permitAll()
            .and()
            .formLogin()
            .defaultSuccessUrl("/home")
            .and()
            .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/login")
            .deleteCookies()
            .clearAuthentication(true)
            .invalidateHttpSession(true)
            .permitAll()
            .and()
            .csrf().disable();
    }

    @Override
    protected UserDetailsService userDetailsService() {
        return username -> {
            if (username==null||username.trim().length()<=0) {
                throw new UsernameNotFoundException("用户名为空");
            }

            SysUser sysUser = sysUserService.selectUserByUserName(username);
            if (sysUser != null){
                return sysUser;
            }
            throw new UsernameNotFoundException("用户不存在!");
        };
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }
}
