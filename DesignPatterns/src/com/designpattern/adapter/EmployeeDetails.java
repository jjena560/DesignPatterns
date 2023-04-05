package com.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.dto.Employee;

public class EmployeeDetails {
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee(1, "Jp", 8826);
		Employee emp2 = new Employee(2, "messi", 9871);
		Employee emp3 = new Employee(3, "ron", 5505);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		return employees;
	}
}
