package com.dlq.startertest.controller;

import com.dlq.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-07 21:45
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHelloSpringBoot("hahaha");
    }
}
