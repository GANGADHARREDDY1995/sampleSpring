package com.benz.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benz.dao.EmployeeDao;
import com.benz.entity.Employee;

@Service
public class EmployeeService {

	private final static Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployeeData() {
		logger.info("EmployeeService>>getAllEmployeeData>>Started...");
		logger.info("EmployeeService>>getAllEmployeeData>>Started...");
		return employeeDao.getAllEmployeeData();
	}
}
