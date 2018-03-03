package com.javagists.command.design.pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * https://www.javagists.com/command-pattern-java-examples
 * @author T Tak
 *
 */
public class HomeOwnerClient {

	public static void main(String[] args) {
		// OnCommand is instantiated based on active device supplied by Remote
		HomeElectronics ce = UniversalRemote.getActiveDevice();
		OnCommand onCommand = new OnCommand(ce);
		ButtonInvoker onButton = new ButtonInvoker(onCommand);
		onButton.click();

		LightSystemReceiver ls = new LightSystemReceiver();
		AirconditionReceiver ac = new AirconditionReceiver();
		List<HomeElectronics> all = new ArrayList<HomeElectronics>();
		all.add(ls);
		all.add(ac);
		OffCommand offAll = new OffCommand(all);
		ButtonInvoker offAllButton = new ButtonInvoker(offAll);
		offAllButton.click();
	}

}
