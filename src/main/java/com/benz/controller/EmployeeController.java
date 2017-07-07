package com.benz.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.benz.entity.Employee;
import com.benz.service.EmployeeService;

@Controller
@RequestMapping
public class EmployeeController {

	private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		String message = "hello ganga how areyou man ";
		logger.info("EmployeeController>>helloWorld>>Started...");
		return new ModelAndView("hellopage", "message", message);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView getAllEmployeeData() {
		logger.info("EmployeeController>>getAllEmployeeData>>Started...");

		List<Employee> employees = employeeService.getAllEmployeeData();
		Employee employee = employees.get(0);
		logger.info("...EmployeeController>>getAllEmployeeData>>End");
		return new ModelAndView("hellopage", "message", employee);
	}
}
