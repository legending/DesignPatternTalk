package com.legend.dp.c24_dutychain;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void handleRequest(MyRequest request) {
		if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
			System.out.printf("%s批准了你的申请\n", name);
		} else {
			if (superior != null) superior.handleRequest(request);
		}
	}
	
}
