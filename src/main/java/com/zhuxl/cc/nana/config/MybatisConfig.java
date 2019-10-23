package com.zhuxl.cc.nana.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Title:        MybatisConfig.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
@Configuration
@MapperScan("com.zhuxl.cc.nana.dao")
public class MybatisConfig {
}
