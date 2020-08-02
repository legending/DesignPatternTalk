package com.legend.dp.c7.proxy;

/*
* 当前示例：代理模式-->小伙追女孩儿
* 适用场景：（1）远程代理（VPN）
* 		   （2）虚拟代理（如网页显示图片的过程，proxy提供尺寸信息先占位，然后等图片真的加载出来再显示）
* 		   （3）控制对真实对象的访问权限（如数据库架构中，外网不能直接访问，必须通过代理才能访问）
* 		   （4）在调用真实对象前做一些铺垫工作
* 优点：隐藏真实对象的实现细节，访问控制
* 特点：代理动作为父类，代理与真实对象分别继承它，代理的每一个方法都不自己实现而是直接调用真实的对象的方法
* */

public class MainTest {

	public static void main(String[] args) {
		
		Girl girl = new Girl("jiaojiao");
		Proxy test = new Proxy(girl);
		
		test.giveClothes();
	}

}