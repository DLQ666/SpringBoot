package com.dlq.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot
 *@description: 前端控制器
 *@author: Hasee
 *@create: 2020-08-02 13:15
 */
//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }

    //RESTAPI的方式
}
