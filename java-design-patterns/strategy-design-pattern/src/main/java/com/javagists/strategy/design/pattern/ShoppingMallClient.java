package com.javagists.strategy.design.pattern;
/**
 * https://www.javagists.com/strategy-design-pattern
 * @author T TAK
 *
 */
public class ShoppingMallClient {
	public static void main(String[] args) {
		ShoppingMallContext context = new ShoppingMallContext();
		int billAmount = 345;
		String day = "Monday";

		if (day != null && day == "Monday") {
			// Monday
			System.out.println("It's Monday");
			context.setDiscountStrategy(new LowDiscountStrategy());
			billAmount = context.getFinalBill(billAmount);
		} else {
			// Friday
			context.setDiscountStrategy(new HighDiscountStrategy());
			billAmount = context.getFinalBill(billAmount);
		}

		System.out.println("Total Bill Amount = " + billAmount);
	}

}
