package com.zhuxl.cc.nana.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

/**
 * 自定义 spring security 消息配置类
 *
 * @author: zhuxl
 * @Date: 2020/6/19
 */
@Configuration
public class CustomSecurityMessages {

    @Bean
    public MessageSource messageSource() {
        Locale.setDefault(Locale.CHINA);
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("classpath:messages_zh_CN");

        return messageSource;
    }
}
