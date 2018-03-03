package com.javagists.command.design.pattern;

/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class OnCommand implements Command {
	
	private HomeElectronics homeElectronics;
	
	public OnCommand (HomeElectronics homeElc){
		this.homeElectronics = homeElc;		
	}

	@Override
	public void execute() {
		homeElectronics.on();
	}

}
