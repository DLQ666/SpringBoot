package com.dlq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringbootConfig2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfig2Application.class, args);
    }

}
