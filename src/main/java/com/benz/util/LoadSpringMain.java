package com.benz.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.benz.entity.Employee;

public class LoadSpringMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/employee-servlet.xml");
		Employee employ = (Employee) context.getBean("employee");
		System.out.println(employ.getName());
		System.out.println(employ.getAddress());
		System.out.println(employ.getPerson());
		// employ.getCourses();
	}
}
