package com.legend.dp.c8_factorymethod;

public class UnderGraduateFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new UnderGraduate();
	}

}