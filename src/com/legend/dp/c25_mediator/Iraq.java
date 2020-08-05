package com.legend.dp.c25_mediator;

public class Iraq extends Country {

	public Iraq(UnitedOrg mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("伊拉克获得消息：" + message);
	}
	
}
