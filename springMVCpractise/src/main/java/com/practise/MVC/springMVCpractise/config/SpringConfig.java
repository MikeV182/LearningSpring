package com.practise.MVC.springMVCpractise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.practise.MVC")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
