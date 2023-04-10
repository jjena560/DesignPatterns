package com.designpattern.chainofresponsibility;

public class RoleCheckMiddleware extends Middleware {

	@Override
	public boolean check(String user, String pass) {
		if(user.contains("@admin")) {
			System.out.println("Hello admin");
			return true;
		}
		
		System.out.println("Hello user");
		return checkNext(user, pass);
	}

}
