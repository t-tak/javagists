package com.javagists.flyweight.design.pattern;

import java.util.HashMap;
/**
 * 
 * @author javagists.com
 *
 */
public class TeacupFactory {

	private static final HashMap<String, ConcreteTeacup> cups = new HashMap();

	public static ConcreteTeacup getTeacup(String id) {
		ConcreteTeacup concretecup = (ConcreteTeacup) cups.get(id);

		if (concretecup == null) {
			
			if (id.equals("001")) {
				concretecup = new ConcreteTeacup("Red", "Traingle");
			} else if (id.equals("002")) {
				concretecup = new ConcreteTeacup("Green", "Round");
			} else if (id.equals("003")) {
				concretecup = new ConcreteTeacup("Blue", "Square");
			}
			concretecup.addIngInitailIngredients();
			concretecup.applyTemperature();
			concretecup.makeBaseMixture();
			cups.put(id, concretecup);
		}
		
		return concretecup;
	}
}
