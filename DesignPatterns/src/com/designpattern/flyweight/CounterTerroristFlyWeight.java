package com.designpattern.flyweight;

public class CounterTerroristFlyWeight implements Player {

	private final String TASK;

	// Extrinsic Attribute
	private String weapon;

	public CounterTerroristFlyWeight() {
		TASK = "DIFFUSE BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}

}
