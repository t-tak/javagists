package com.javagists.bridge.design.pattern;
/**
 * 
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class ShapeColorTester {

	public static void main(String[] args) {

		// Creating the Triangle instance and apply red color
		System.out.println("Appying Red Color to the Triangle");
		AbstractShape triagleRed = new RefinedShapeTriangle(new ConcreteColorRed());
		triagleRed.applyShapeColor();

		// Creating the Triangle instance and apply green color
		System.out.println("Appying Green Color to the Triangle");
		AbstractShape triagleGreen = new RefinedShapeTriangle(new ConcreteColorGreen());
		triagleGreen.applyShapeColor();

		// Creating the Circle instance and apply red color
		System.out.println("Appying Red Color to the Circle");
		AbstractShape circleRed = new RefinedShapeCircle(new ConcreteColorRed());
		circleRed.applyShapeColor();
		
		// Creating the Circle instance and apply green color
		System.out.println("Appying Green Color to the Circle");
		AbstractShape circleGreen = new RefinedShapeCircle(new ConcreteColorGreen());
		circleGreen.applyShapeColor();
	}

}
