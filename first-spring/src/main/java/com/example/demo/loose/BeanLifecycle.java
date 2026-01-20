package com.example.demo.loose;

import org.springframework.stereotype.Component;

@Component
public class BeanLifecycle {

    private  NotificationService notificationService;

    public BeanLifecycle(NotificationService notificationService){
        System.out.println("Constructor called");
        this.notificationService = notificationService;
    }

    public void init (){
        System.out.println("Init method called bean initialized");
        notificationService.send("Hi what's up from init method");
    }
    public void performTask(){
        System.out.println("Task performed");
    }
    public void cleanUp(){
        System.out.println("Destroy bean");
    }
}