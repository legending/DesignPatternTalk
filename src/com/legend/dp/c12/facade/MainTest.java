package com.legend.dp.c12.facade;

/*
 * 当前实例：外观模式
 * 适用场景：（1）简化复杂系统
 * 			（2）基于遗留代码开发新的接口
 * 好处：把不变的行为移动到超类，从而减少子类中的重复代码
 * 特点：分层，外层类不需要知道内层内的具体调用细节
 * */

public class MainTest {
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
	
}
