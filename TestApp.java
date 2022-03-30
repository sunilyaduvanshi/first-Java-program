package com.spring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 public class TestApp {
    public static void main(String[] args) {
 
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springapp1.xml");
        Employee employee = ctx.getBean("employee_1",Employee.class);
        System.out.println(employee);

    }
 
}