package com.javagists.bridge.design.pattern;
/**
 * 
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public abstract class AbstractShape {

	// Creating the implementor instance (Composition)
	protected ColorImplementor color;

	// constructor with implementor as input argument
	public AbstractShape(ColorImplementor c) {
		this.color = c;
	}

	//Abstract method related to filling the color to the object
	abstract public void applyShapeColor();
}
