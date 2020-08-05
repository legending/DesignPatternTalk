package com.legend.dp.c7.proxy;

/*
 * 当前示例：代理模式-->小伙追妹子
 * 定义：访问一个对象不直接调用，而是通过一个代理控制对这个对象的访问
 * 适用场景：（1）远程代理（VPN）
 * 		   （2）虚拟代理（如网页显示图片的过程，proxy提供尺寸信息先占位，然后等图片真的加载出来再显示）
 * 		   （3）控制对真实对象的访问权限（如数据库架构中，外网不能直接访问，必须通过代理才能访问）
 * 		   （4）在调用真实对象前做一些铺垫工作
 * 特点：代理的每一个方法都不自己实现而是直接调用真实的对象的方法,从而隐藏真实对象的实现细节，可以做访问控制
 * */

public class MainTest {

	public static void main(String[] args) {
		
		Girl girl = new Girl("jiaojiao");
		Proxy test = new Proxy(girl);
		
		test.giveClothes();
	}

}