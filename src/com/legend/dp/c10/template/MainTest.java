package com.legend.dp.c10.template;

/*
 * 当前示例：模板方法模式
 * 定义：父类定义算法骨架，可以通过改变子类的实现方法来改变父类的行为
 * 适用场景：当子类的可变行为与不可变行为混在一起的时候，那么不变的行为就会在子类中出现
 * 特点：把不变的行为移动到超类，从而减少子类中的重复代码
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
