package com.designpattern.adapter;

public class Test {
	public static void main(String[] args) {
		EmployeeAdpater source = new EmployeeAdpater();
		Intranet obj = new Intranet(source);
//		obj.printPhoneNumbers();
		EmployeeAdpater.printNum();
	}
	
	
}
