package com.javagists.adapter.design.pattern;

import java.util.stream.IntStream;
/**
 * 
 * https://www.javagists.com
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class RussianAdaptee {

	public void retrieveDescription(String inRussian) {
		IntStream description = inRussian.chars();
		System.out.println("Retrieving Description from Adapter...");
		
	}

	public void performInstructions(String descriptions) {
		System.out.println("Executing Instructions...");
		this.retrieveDescription(descriptions);
		descriptions = descriptions + " translated to russian";
		System.out.println(descriptions);
	}

}
