package com.javagists.adapter.design.pattern;
/**
 * 
 * https://www.javagists.com
 * 
 * w w w . j a v a g i s t s . c o m
 * @author T Tak
 *
 */
public class TranslatorAdapter implements JapaneseTarget {

	// Adaptee - The class we are adapting from
	private RussianAdaptee russianAdaptee;

	// Constructor contains the reference to Adaptee instance
	public TranslatorAdapter(RussianAdaptee russianAdaptee) {
		this.russianAdaptee = russianAdaptee;
	}

	@Override
	public void showPictures() {
		// Steps to read picture
	}

	String translate(String japaneseWords) {
		System.out.println("Translating Japanese Words.........");
		japaneseWords = japaneseWords + "  arigatho gosaymas";
		System.out.println(japaneseWords);
		return japaneseWords;
	}

	@Override
	public String readDescription(String words) {
		System.out.println("Reading Japanese Words.........");
		System.out.println(words);
		return words;
	}

}
