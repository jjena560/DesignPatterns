package com.designpattern.adapter;

import java.util.List;

import com.designpattern.dto.Employee;

// consumer class
public class Intranet {
	IPhoneListSource source;
	
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	public void printPhoneNumbers() {
		List<Employee> Employee = source.getEmployees();
		System.out.println(Employee.get(0).getPhoneNumber());
	}

}
