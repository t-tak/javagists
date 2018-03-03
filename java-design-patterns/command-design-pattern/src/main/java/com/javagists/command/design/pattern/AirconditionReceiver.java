package com.javagists.command.design.pattern;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class AirconditionReceiver implements HomeElectronics {

	@Override
	public void on() {
		System.out.println("Aircondition is on!");

	}

	@Override
	public void off() {
		System.out.println("Aircondition is off!");

	}

}
