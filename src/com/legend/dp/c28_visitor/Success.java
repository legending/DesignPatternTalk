package com.legend.dp.c28_visitor;

public class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(man.getClass().toString() + this.getClass().toString() + "man success");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(woman.getClass().toString() + this.getClass().toString() + "woman success");
	}
	
}
