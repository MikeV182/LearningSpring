package com.learning.REST.springRESTApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learning.REST.springRESTApp")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
