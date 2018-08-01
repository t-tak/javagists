package com.t.designpatterns.structural.flyweight;
/**
 * 
 * @author javagists.com
 *
 */
public class ConcreteTeacup extends TeacupBaseAbstractClass {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	private String shape;

	public ConcreteTeacup(String color, String shape) {
		this.color = color;
		this.shape = shape;
	}
	/*
	 * extrinsic state i.e. speed comes from client as method parameter and its
	 * not shared across the Teacup object
	 */

	@Override
	public void addColor(String color) {
		System.out.println("Adding color " + color + " to the teacup");
	}

	@Override
	public void applyShape(String shape) {
		System.out.println("Adding shape " + shape + " to the teacup");
	}

	@Override
	public void manufactureTeacup() {
		System.out.println("Teacup: with Color : " + color + " and " + shape);
	}
}
