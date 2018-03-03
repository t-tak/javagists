package com.javagists.command.design.pattern;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class UniversalRemote {

	public static HomeElectronics getActiveDevice() {
		// here we will have a complex electronic circuit :-)
		// that will maintain current device
		LightSystemReceiver ls = new LightSystemReceiver();
		return ls;
	}
}
