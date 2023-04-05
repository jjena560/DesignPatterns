package com.designpattern.adapter;

import java.util.List;

import com.designpattern.dto.Employee;

public interface IPhoneListSource {
	public List<Employee> getEmployees();

}
