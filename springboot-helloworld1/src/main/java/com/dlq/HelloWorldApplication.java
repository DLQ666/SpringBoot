package com.dlq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@program: SpringBoot
 *@description: 主启动
 *@author: Hasee
 *@create: 2020-08-01 20:36
 *
 * @SpringBootApplication 来标注一个主启动类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
