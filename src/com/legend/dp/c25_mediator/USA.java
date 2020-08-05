package com.legend.dp.c25_mediator;

public class USA extends Country {

	public USA(UnitedOrg mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("美国获得消息：" + message);
	}
	
}
