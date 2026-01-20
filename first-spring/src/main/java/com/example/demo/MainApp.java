package com.example.demo;

import com.example.demo.loose.BeanLifecycle;
import com.example.demo.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//ApplicationContext context = new
//        AnnotationConfigApplicationContext(AppConfig.class);

//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextBean.xml");

//  GreetingService greetingService = (GreetingService) context.getBean("myBean");
//  greetingService.sayHello();



//UserService userService = (UserService) context.getBean("UserServiceSMS");
//
//userService.notifyUser("What's app");


        System.out.println("Starting bean application context");


        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);



        System.out.println("Retrieving Lifecycle bean ");
        BeanLifecycle beanLifecycle = context.getBean(BeanLifecycle.class);


        beanLifecycle.performTask();


        System.out.println("Closing spring context");
    }
}
