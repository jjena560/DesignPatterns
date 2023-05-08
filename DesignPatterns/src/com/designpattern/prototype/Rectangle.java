package com.designpattern.prototype;

class Rectangle implements Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("Drawing rectangle with width " + width + " and height " + height);
	}

	public Shape clone() {
		return new Rectangle(this.width, this.height);
	}
}