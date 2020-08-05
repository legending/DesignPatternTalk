package com.legend.dp.c8_factorymethod;

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}

}
