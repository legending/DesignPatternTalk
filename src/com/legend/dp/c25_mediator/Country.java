package com.legend.dp.c25_mediator;

public abstract class Country {

	protected UnitedOrg mediator;
	
	public Country(UnitedOrg mediator) {
		this.mediator = mediator;
	}
	
}
