package com.legend.dp.c13_builder;

public class ConcreteBuilderB extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("partX");
	}

	@Override
	public void buildPartB() {
		product.add("partY");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
