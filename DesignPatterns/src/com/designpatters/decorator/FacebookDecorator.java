package com.designpatters.decorator;

public class FacebookDecorator extends BaseDescorator{

	@Override
	public void sendMessage(String message) {
		super.sendMessage(message);
	}

	public FacebookDecorator(Notifier notifier) {
		super(notifier, "Facebook Notication");
	}

}
