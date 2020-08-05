package com.legend.dp.c1.simplefactory;

/*
 * 当前示例：简单工厂模式-->运算器工厂
 * 定义：给什么参数就生产对应的产品
 * 适用场景：根据不同的参数生成不同的实例
 * 特点：被创建的实例通常有相同的父类，工厂类中获取实例的方法是静态的，所以也叫静态工厂
 * */

public class MainTest {

	public static void main(String[] args) {
		Operation operation = SimpleFactory.getOperation('+');
		operation.numA = 1.0;
		operation.numB = 2.2;
		double test = operation.getResult();
		System.out.println(test);
		System.out.println("----------------------------");
		
		Operation operation2 = SimpleFactory.getOperation('-');
		operation2.numA = 3.3;
		operation2.numB = 1.0;
		System.out.println(operation2.getResult());
		System.out.println("----------------------------");
		
		Operation operation3 = SimpleFactory.getOperation('*');
	}

}
