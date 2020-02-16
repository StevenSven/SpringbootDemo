package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class interfacetest {

    @RequestMapping("/hello")
    public String hello(){
//        System.out.println("hello world");
        return "hello world";
    }
}
