package com.designpattern.flyweight;

public class TerroristFlyweight implements Player {

	private final String TASK;

	// Extrinsic Attribute
	private String weapon;

	public TerroristFlyweight() {
		TASK = "PLANT A BOMB";
	}

	public void assignWeapon(String weapon) {
		// Assign a weapon
		this.weapon = weapon;
	}

	public void mission() {
		// Work on the Mission
		System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}

}
