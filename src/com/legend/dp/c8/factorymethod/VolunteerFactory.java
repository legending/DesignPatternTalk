package com.legend.dp.c8.factorymethod;

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}

}
