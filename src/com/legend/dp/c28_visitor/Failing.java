package com.legend.dp.c28_visitor;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(man.getClass().toString() + this.getClass().toString() + "man failing");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(woman.getClass().toString() + this.getClass().toString() + "woman failing");
	}
	
}
