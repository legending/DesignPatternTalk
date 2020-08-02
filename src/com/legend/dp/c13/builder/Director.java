package com.legend.dp.c13.builder;

public class Director {
	
	public void construct(AbstractBuild build) {
		build.buildPartA();
		build.buildPartB();
	}

}
