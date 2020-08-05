package com.legend.dp.c28_visitor;

//因为性别分类是稳定的，所以Action里的方法是固定的
public abstract class Action {

	public abstract void getManConclusion(Man ConcreteElementA);
	
	public abstract void getWomanConclusion(Woman ConcreteElementB);
	
}