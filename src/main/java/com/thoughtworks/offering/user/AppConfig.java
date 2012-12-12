package com.thoughtworks.offering.user;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ImportResource({"classpath*:/rest_config.xml"})
@ComponentScan(basePackages = "org.rest")
//@PropertySource({"classpath:rest.properties", "classpath:web.properties"})
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}