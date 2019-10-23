package com.zhuxl.cc.nana.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * Title:        SwaggerConfig.java
 * <p>
 * Description:Swagger2配置类
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

    /**
     * 生产环境可以设置关闭swagger
     */
    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnabled;



    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(swaggerEnabled)
                .select()
                //为controller包下生成api文档
                .apis(RequestHandlerSelectors.basePackage("com.zhuxl.cc.nana.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("账号管理系统 使用 Swagger2 构建 API")
                //创建人
                .contact(new Contact("cchisoka", "", "cchisoka@gmail.com"))
                //版本号
                .version("0.0.1")
                //描述
                .description("API 描述")
                .build();
    }
}
