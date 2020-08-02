package com.legend.dp.c24.dutychain;

/*
 * 当前示例：责任链模式----申请审批
 * 定义：一个请可以沿着沿着一个处理链依次传递，直到有一个对象处理它为止
 * 适用场景：申请审批
 * 特点：可以简化对象之间的相互连接，可以按需修改处理链
 * */

public class MainTest {

	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("部门经理");
		Majordomo majordomo = new Majordomo("总监");
		GeneralManager generalManager = new GeneralManager("总经理");

		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);
		
		MyRequest request = new MyRequest();
		request.setRequestType("请假");
		request.setRequestContent("回家生孩子");
		request.setNumber(1);
		commonManager.handleRequest(request);
		request.setNumber(3);
		commonManager.handleRequest(request);
		
		request.setRequestType("加薪");
		request.setRequestContent("能力提升较快，为公司做出了重大贡献");
		request.setNumber(600);
		commonManager.handleRequest(request);
	}
	
}
