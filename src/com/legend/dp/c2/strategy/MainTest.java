package com.legend.dp.c2.strategy;

/*
 * 当前示例：策略模式-->超市收银策略
 * 定义：把不同算法分别封装起来，它们之间可以相互替换，但客户端不受影响
 * 适用场景：在不同的情况下需要运用不同的规则的时候
 * 特点：所有算法完成的工作相同，但是实现不同，每种算法相互独立，降低了耦合，简化了单元测试，一般会配合简单工厂模式一起使用
 * */

public class MainTest {
	
	public static void main(String[] args) {
		CashContext context = new CashContext("normal");
		System.out.println(context.getResult(10000.0));
		
		CashContext context2 = new CashContext("discount");
		System.out.println(context2.getResult(100000.0));
	}
	
}
