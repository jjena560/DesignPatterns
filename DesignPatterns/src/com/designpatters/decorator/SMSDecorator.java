package com.designpatters.decorator;

public class SMSDecorator extends BaseDescorator{

	@Override
	public void sendMessage(String message) {
		super.sendMessage(message);
	}

	public SMSDecorator(Notifier notifier) {
		super(notifier, "SMS message");
	}

}
