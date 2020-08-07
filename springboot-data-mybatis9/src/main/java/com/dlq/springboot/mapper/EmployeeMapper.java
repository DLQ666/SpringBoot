package com.dlq.springboot.mapper;

import com.dlq.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-07 15:09
 */
//@Mapper或者启动类、配置类加@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
