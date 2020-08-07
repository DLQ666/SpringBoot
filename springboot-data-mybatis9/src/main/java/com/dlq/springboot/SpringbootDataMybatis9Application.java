package com.dlq.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.dlq.springboot.mapper")
@SpringBootApplication
public class SpringbootDataMybatis9Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatis9Application.class, args);
    }

}
