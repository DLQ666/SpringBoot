package com.dlq.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-02 15:37
 */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    private String sayHello(){
        return "Hello +"+ name;
    }
}
