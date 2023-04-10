package com.designpatters.decorator;

public class EmailDecorator extends BaseDescorator{

	@Override
	public void sendMessage(String message) {
		super.sendMessage(message);
	}

	public EmailDecorator(Notifier notifier) {
		super(notifier, "Email message");
	}

}
