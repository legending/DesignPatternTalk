package com.legend.dp.c28_visitor;

public class Success extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println(ConcreteElementA.getClass().toString() + this.getClass().toString() + "man success");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementB) {
		System.out.println(ConcreteElementB.getClass().toString() + this.getClass().toString() + "woman success");
	}
	
}
