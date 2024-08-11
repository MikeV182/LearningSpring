package com.learn.JUnitPractise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learn.JUnitPractise")
@PropertySource("classpath:application.properties")
public class SpringConfiguration {
}
