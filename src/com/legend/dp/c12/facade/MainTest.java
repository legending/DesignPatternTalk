package com.legend.dp.c12.facade;

/*
 * 当前示例：外观模式
 * 定义：把子系统的接口再封装一层，然后向客户端提供统一致的访问方式，使得子系统更容易被使用
 * 适用场景：（1）分层，简化复杂系统，如果经典的三层架构
 * 			（2）基于遗留代码开发新的接口
 * 特点：分层，降低耦合
 * */

public class MainTest {
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
	
}
