package com.javagists.adapter.design.pattern;
/**
 * 
 * https://www.javagists.com
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class JapaneseClient {
	public static void main(String args[]) {
		RussianAdaptee radaptee = new RussianAdaptee();
		TranslatorAdapter adapter = new TranslatorAdapter(radaptee);
		String words="Japanses Words";
		String russianWords = adapter.translate(adapter.readDescription(words));
		radaptee.performInstructions(russianWords);
		
	}

}
