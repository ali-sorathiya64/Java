package com.example.demo.loose;


import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Notification : " + message);

    }
}
