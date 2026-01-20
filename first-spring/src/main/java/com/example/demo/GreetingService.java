package com.example.demo;


import org.springframework.stereotype.Component;

@Component("userBean")
public class GreetingService {

    void sayHello(){
        System.out.println("Hello from spring framework");
    }
}
