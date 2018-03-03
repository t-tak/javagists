package com.javagists.command.design.pattern;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class LightSystemReceiver implements HomeElectronics {

	@Override
	public void on() {
		System.out.println("Light System is on!");

	}

	@Override
	public void off() {
		System.out.println("Light System is off!");

	}

}
