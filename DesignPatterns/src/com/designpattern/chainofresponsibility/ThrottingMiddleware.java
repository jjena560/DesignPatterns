package com.designpattern.chainofresponsibility;

public class ThrottingMiddleware extends Middleware {
	private int requestPerMinute;
	private int request;
	private long currentTime;

	public ThrottingMiddleware(int requestPerMinute) {
		this.requestPerMinute = requestPerMinute;
		this.currentTime = System.currentTimeMillis();
	}

	@Override
	public boolean check(String user, String pass) {
//		check if it is still under one minute
		if(System.currentTimeMillis() > currentTime + 60_000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		
		request++;
		
		if(request > requestPerMinute) {
			System.out.println("Request limit exceeded");
			Thread.currentThread().stop();
		}
		// this handler won't handle the process so it passes down
		return checkNext(user, pass);
	}

}
