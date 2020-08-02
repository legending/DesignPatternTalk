package com.legend.dp.c2.strategy;

/*
* 当前示例：收银策略
* 适用场景：完成一件事不同时间可能有不同的算法规则，一般使用时会跟简单工厂模式配合使用
* 好处：便于后期扩展（遵循了开放封闭原则：对扩展开放，对修改封闭）
* 特点：两大类 策略类（一父多子）+context类
* */

public class MainTest {
	
	public static void main(String[] args) {
		CashContext context = new CashContext("normal");
		System.out.println(context.getResult(10000.0));
		
		CashContext context2 = new CashContext("discount");
		System.out.println(context2.getResult(100000.0));
	}
	
}
