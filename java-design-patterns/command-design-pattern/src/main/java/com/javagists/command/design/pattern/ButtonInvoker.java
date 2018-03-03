package com.javagists.command.design.pattern;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class ButtonInvoker {

	Command c;

	public ButtonInvoker(Command c) {
		this.c = c;
	}

	public void click(){
		c.execute();
	}
}
