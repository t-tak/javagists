package com.javagists.flyweight.design.pattern;
/**
 * 
 * @author javagists.com
 *
 */
public abstract class TeacupBaseAbstractClass {
	
	/*
	 * Following two methods incorporate the extrinsic state to the pattern
	 * by including unshareable features in method parameters.
	 */
	public abstract void addColor(String color);
	
	public abstract void applyShape(String shape);
	
	public abstract void manufactureTeacup();
	
	/*
	 * Following two methods incorporate the intrinsic state to the pattern
	 * by implementing shareable methods for the Teacup prosuction
	 */

	public void addIngInitailIngredients() {

		System.out.println("Adding Base Ingredients for the mold");
	}

	public void applyTemperature() {

		System.out.println("Applying Temperature");
	}

	public void makeBaseMixture() {

		System.out.println("Making base mixture");
	}
}
