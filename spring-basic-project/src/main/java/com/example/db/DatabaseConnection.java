package com.example.db;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DatabaseConnection {
  public List<String> Users;


  public void init(){
    System.out.println("Database connect");

  }

  public void addUser(String user){
    Users.add(user);

  }

  public List<String> getUsers(){
    return Users;
  }

}
