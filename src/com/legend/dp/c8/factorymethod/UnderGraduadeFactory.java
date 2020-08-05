package com.legend.dp.c8.factorymethod;

public class UnderGraduadeFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new UnderGraduate();
	}

}
