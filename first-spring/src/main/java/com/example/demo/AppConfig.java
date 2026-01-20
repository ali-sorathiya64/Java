package com.example.demo;

import com.example.demo.loose.BeanLifecycle;
import com.example.demo.loose.NotificationService;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

 @Bean(initMethod = "init" , destroyMethod = "cleanUp")
    public BeanLifecycle beanLifecycle(NotificationService notificationService){
     return new BeanLifecycle(notificationService);

 }
}
