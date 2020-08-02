package com.legend.dp.c10.template;

/*
 * 当前实例：模板方法模式
 * 适用场景：很多类都有很多相同的行为
 * 好处：把不变的行为移动到超类，从而减少子类中的重复代码
 * 特点：一父多子，父类包含所有子类的公共行为
 * */

public class MainTest {

	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
	}
	
}
