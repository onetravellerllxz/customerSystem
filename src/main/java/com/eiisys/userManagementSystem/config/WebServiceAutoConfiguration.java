package com.eiisys.userManagementSystem.config;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 〈web页面配置〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/9
 * @since 1.0.0
 */
@Configuration
public class WebServiceAutoConfiguration {
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(){
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        ErrorPage errorPage403 = new ErrorPage(HttpStatus.FORBIDDEN,"/error/403");
        factory.addErrorPages(errorPage403);
        return  factory;
    }
}
