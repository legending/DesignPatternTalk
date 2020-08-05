package com.legend.dp.c6_decorator.v1;

/*
 * 当前示例：装饰器模式
 * 定义：动态给一个对象添加额外的职责，相对于生成子类更加灵活
 * 适用场景：当一个类需要执行特殊的非主要职责的时候
 * 特点：把装饰功能从原有的类中移出去，使得类的核心职责与修饰功能区分开，同时还能去除相关类中的装饰逻辑（java中的注解使用的全都是装饰器模式）
 * */

public class MainTest {
	
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		DecorateA d1 = new DecorateA();
		DecorateB d2 = new DecorateB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}

}
