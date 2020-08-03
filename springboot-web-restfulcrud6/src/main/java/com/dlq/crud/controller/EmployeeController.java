package com.dlq.crud.controller;

import com.dlq.crud.dao.EmployeeDao;
import com.dlq.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-03 21:23
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps",employees);
        //放在请求域中
        //thymleaf默认会拼串
        //classpath:/templates/xxxxx.html
        return "emp/list";
    }
}
