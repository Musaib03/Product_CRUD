package com.example.WebSpring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeClass {

    @RequestMapping("/")
    public String greet(){
        return "Hello, welcome to WebSpring!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is a about page of simple Spring Boot application.";
    }
}
