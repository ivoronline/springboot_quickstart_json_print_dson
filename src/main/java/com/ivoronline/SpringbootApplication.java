package com.ivoronline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(SpringbootApplication.class, args);
    
    //CREATE OBJECT
    Person person      = new Person();
           person.name = "John";
           person.age  = 20;

    //PRINT OBJECT
    Gson   gson       = new GsonBuilder().setPrettyPrinting().create();
    String personJson = gson.toJson(person);
    System.out.println(personJson);
    
  }
  
}
