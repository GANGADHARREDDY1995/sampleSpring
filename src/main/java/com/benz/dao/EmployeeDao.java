package com.benz.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.benz.entity.Employee;

@Repository
public class EmployeeDao extends HibernateDaoSupport {

	private HibernateTemplate hibernateTemplate;  

	private final static Logger logger = LoggerFactory.getLogger(EmployeeDao.class);

	public List<Employee> getAllEmployeeData() {
		logger.info("EmployeeDao>>getAllEmployeeData>>Started...");
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee("Ram", "Bangalore", null);
		employees.add(employee);
		
		hibernateTemplate.get
		
		logger.info("...EmployeeDao>>getAllEmployeeData>>End");
		return employees;
	}

}
