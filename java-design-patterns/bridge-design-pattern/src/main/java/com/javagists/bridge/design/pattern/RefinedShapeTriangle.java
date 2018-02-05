package com.javagists.bridge.design.pattern;
/**
 * 
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class RefinedShapeTriangle extends AbstractShape {

	public RefinedShapeTriangle(ColorImplementor c) {
		super(c);
	}

	@Override
	public void applyShapeColor() {
		System.out.print("Triangle color applying - ");
		color.applyColor();
	}

}
