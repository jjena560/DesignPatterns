package com.designpattern.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static Server server;
	public static void main(String[] args) throws IOException {
		init();
		
		boolean success;
		do {
			System.out.println("Enter username: ");
			String user = reader.readLine();
			System.out.println("Enter password: ");
			String pass = reader.readLine();
			success = server.login(user, pass);
		}while(!success);
		
	}
	private static void init() {
		server = new Server();
		server.register("Jp", "9871");
		server.register("mansi", "9877");
		
		// All checks are linked
		Middleware middleware = Middleware.link(
				new ThrottingMiddleware(2),
				new UserExistsMiddleware(server),
				new RoleCheckMiddleware()
				);
		
		server.setMiddleware(middleware);
		
	}

}
