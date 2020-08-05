package com.legend.dp.c8_factorymethod;

/*
 * 当前示例：工厂方法模式-->雷锋工厂
 * 定义：定义一个创建对象的接口，让它的子类决定实例化哪一个类
 * 适用场景：客户端自己决定获取哪个类的实例
 * 特点：工厂方法模把判断逻辑放在了客户端，实现了开放封闭原则，如果是简单工厂，增加一个产品类就要修改factory，而现在只需要更改客户端自己的调用逻辑
 * */

public class MainTest {

	public static void main(String[] args) {
		IFactory factory = new VolunteerFactory();
		LeiFeng volunteer = factory.CreateLeiFeng();
		
		volunteer.sweep();
	}
}