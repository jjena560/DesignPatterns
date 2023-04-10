package com.designpatters.decorator;

/**
 * @author jyotiprakashjena
 * Concrete Component is a class of objects being wrapped. It defines the basic behavior, 
 * which can be altered by decorators.
 *
 */
public class ConcreteNotifier implements Notifier{
	private String notification;

    public ConcreteNotifier(String notification) {
        this.notification = notification;
    }


	@Override
	public void sendMessage(String message) {
		System.out.println(notification);		
	}


	@Override
	public void showMessage() {
		System.out.println("Concrete msg");
	}

}
