package com.benz.entity;

import java.util.List;

public class Employee {
	
	String name;
	String address;
	List<String> courses;
	Person person;

	public Employee(String name, String address, List<String> courses, Person person) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.person = person;
	}

	public Employee(String name, String address, Person person) {
		super();
		this.name = name;
		this.address = address;
		this.person = person;
	}

	public List<String> getCourses() {
		System.out.println("course   name   ::" + courses);
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
