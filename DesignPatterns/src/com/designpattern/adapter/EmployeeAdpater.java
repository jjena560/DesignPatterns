package com.designpattern.adapter;

import java.util.List;

import com.designpattern.dto.Employee;

// Adapter
public class EmployeeAdpater implements IPhoneListSource{
	EmployeeDetails empDS = new EmployeeDetails();

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empDS.getEmployees();
	}
	
	static void printNum() {
		System.out.println("Hello");
	}

}
