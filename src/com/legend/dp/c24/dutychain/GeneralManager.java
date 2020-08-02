package com.legend.dp.c24.dutychain;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(MyRequest request) {
		if (request.getRequestType().equals("请假")) {
			System.out.printf("%s批准了你的申请\n", name);
		} else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
			System.out.printf("%s批准了你的申请\n", name);
			if (superior != null) superior.handleRequest(request);
		} else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
			System.out.printf("%s让你当面谈谈\n", name);
		}
	}
	
}
