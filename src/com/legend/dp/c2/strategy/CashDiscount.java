package com.legend.dp.c2.strategy;

public class CashDiscount extends CashSuper {

	@Override
	public double getMoney(double money) {
		return 0.8*money;
	}
	
}
