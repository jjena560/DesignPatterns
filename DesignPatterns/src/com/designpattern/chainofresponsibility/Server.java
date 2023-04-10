package com.designpattern.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {
	private Map<String, String> users = new HashMap<>();
	private Middleware middleware;
	
	public boolean login(String name, String password) {
		if(middleware.check(name, password)) {
			System.out.println("Login Successfull");
			return true;
		}
		return false;
	}
	
	void register(String name, String pass) {
		users.put(name, pass);
	}
	
	public boolean hasUser(String name) {
		return users.containsKey(name);
	}
	
	public boolean isValidPassword(String name, String pass) {
		return users.get(name).equals(pass);
	}

	public void setMiddleware(Middleware middleware2) {
		this.middleware = middleware2;
	}
}
