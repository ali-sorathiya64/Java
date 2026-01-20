package com.example.demo.loose;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("UserServiceSMS")
public class UserService {
    public  NotificationService notificationService;


    public  UserService(){

    }
    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

   public  void notifyUser (String message){
        notificationService.send("Notification hello");
   }

}
