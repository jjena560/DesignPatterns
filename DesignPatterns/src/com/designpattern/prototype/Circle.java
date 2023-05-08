package com.designpattern.prototype;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Drawing circle with radius " + radius);
	}

	public Shape clone() {
		return new Circle(this.radius);
	}
}