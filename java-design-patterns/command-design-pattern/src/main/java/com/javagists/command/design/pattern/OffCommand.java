package com.javagists.command.design.pattern;

import java.util.List;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class OffCommand implements Command {

	List<HomeElectronics> homeElecList;

	public OffCommand (List<HomeElectronics> homeElcList){
		this.homeElecList = homeElcList;		
	}

	@Override
	public void execute() {
		for (HomeElectronics homeElec : homeElecList) {
			homeElec.off();
		}
	}
	

}
