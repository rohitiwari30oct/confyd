package com.confyd.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.confyd.service" })
public class ServiceConfig {
}
