package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Subscriber> subscribers;
	
	public Subject() {
		this.subscribers = new ArrayList<>();
	}
	
	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}
	
	public void unsusbscribe(Subscriber sub) {
		subscribers.remove(sub);
	}
	
	public void notifyObservers() {
		subscribers.forEach((sub) -> {
			sub.update(this);
		});
	}

}