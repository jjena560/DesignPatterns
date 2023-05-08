package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();

		// Create and add pre-built prototypes of Rectangle and Circle to the list
		Rectangle rectanglePrototype = new Rectangle(10, 20);
		Circle circlePrototype = new Circle(5);
		shapes.add(rectanglePrototype);
		shapes.add(circlePrototype);

		// Create new instances of the pre-built prototypes using cloning
		Shape rectangle = rectanglePrototype.clone();
		Shape circle = circlePrototype.clone();
		shapes.add(rectangle);
		shapes.add(circle);

		// Draw all the shapes in the list
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}