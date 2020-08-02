package com.legend.dp.c23.command;

/*
 * 当前示例：命令模式----门店烧烤
 * 定义：将客户端的请求封装为一条条命令对象放在队列里，支持撤销操作
 * 适用场景：有请求排队以及支持撤销操作的情况下
 * 特点：请求排队，便于记录日志，支持撤销操作，增加的新命令不影响其他类
 * */

public class MainTest {
	
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWing = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();

		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWing);
		//girl.cancelOrder(bakeMuttonCommand2);
		
		girl.mynotify();
		
	}

}
