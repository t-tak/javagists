package com.javagists.strategy.design.pattern;
/**
 * https://www.javagists.com/strategy-design-pattern
 * @author T TAK
 *
 */
public class ShoppingMallContext {
	private DiscountStrategy strategy;

	public void setDiscountStrategy(DiscountStrategy strategy) {
		this.strategy = strategy;
	}

	public DiscountStrategy getDiscountStrategy() {
		return strategy;
	}

	public int getFinalBill(int amount) {
	    return strategy.getFinalBill(amount);
	  }

}
