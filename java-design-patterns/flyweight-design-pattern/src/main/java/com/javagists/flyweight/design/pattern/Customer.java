package com.javagists.flyweight.design.pattern;
/**
 * 
 * @author javagists.com
 *
 */
public class Customer {

	private static final String id[] = { "001", "002", "003" };
	private static final String shapes[] = { "Round", "Square", "Traingle" };
	private static final String colors[] = { "Red", "Green", "Blue" };

	/*
	 * Generating 30 Teacups
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			ConcreteTeacup teacup = TeacupFactory.getTeacup(getRandomId());
			if (teacup != null) {
				teacup.addColor(getRandomColor());
				teacup.setShape(getRandomShape());
				teacup.manufactureTeacup();
			}
		}

	}

	private static String getRandomId() {
		return id[(int) (Math.random() * id.length)];
	}

	private static String getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}
