package com.designpattern.observer;

public class ScoreCardDisplay implements Subscriber{

	@Override
	public void update(Subject s) {
		display((CricketData) s);
		
	}

	private void display(CricketData s) {
		System.out.println(s.toString());
	}

}
