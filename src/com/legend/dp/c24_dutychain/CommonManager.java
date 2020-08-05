package com.legend.dp.c24_dutychain;

public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(MyRequest request) {
		if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
			System.out.printf("%s批准了你的申请\n", name);
		} else {
			if (superior != null) superior.handleRequest(request);
		}
	}

}
