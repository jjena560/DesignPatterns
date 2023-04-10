package com.designpatters.decorator;

public class BaseDescorator implements Notifier{
	private Notifier wrapee;
	private String msg;
	
	public BaseDescorator(Notifier notifier, String msg) {
		this.wrapee = notifier;
		this.msg = msg;
		
	}

	@Override
	public void sendMessage(String message) {
		wrapee.sendMessage(message);
	}

	@Override
	public void showMessage() {
		System.out.println(this.msg);
		
	}

}
