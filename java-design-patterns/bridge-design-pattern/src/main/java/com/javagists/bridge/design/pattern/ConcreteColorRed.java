package com.javagists.bridge.design.pattern;
/**
 * 
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class ConcreteColorRed implements ColorImplementor{

	@Override
	public void applyColor() {
		System.out.println("Applying Red....");
	}

}
