package com.designpatters.decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		String notificationMsg = "Your inbox is full at {}";
		BaseDescorator notfier = new SMSDecorator(
									new FacebookDecorator(
											new EmailDecorator(
													new ConcreteNotifier(notificationMsg))));
		
		notfier.sendMessage(notificationMsg);
		Notifier plain = new ConcreteNotifier("Concrete msg");
		plain.showMessage();
		notfier.showMessage();
	}

	
	
}
