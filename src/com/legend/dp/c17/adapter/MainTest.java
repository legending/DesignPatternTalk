package com.legend.dp.c17.adapter;

/*
 * 当前示例：适配器模式（适配器分类适配器与对象适配器，因为java不支持多继承，所以这里主要是说对象适配器）-->姚明需要翻译
 * 定义：将一个类的接口转换为客户希望的另一个接口，使得原本接口不兼容的类可以一起工作
 * 适用场景：有东西不能用，但短时间内又不能改造它，只能想办法适配它
 * 特点：由于继承或实现了同一个类，所以客户端可以统一调用方式，因为是无奈之举，所以一般是当第三方组件接口与当前系统接口不一致或开发后期或维护阶段使用
 * */

public class MainTest {
	
	public static void main(String[] args) {
        Player a = new Forwards("A");
		a.attack();

        Player b = new Guards("B");
		b.attack();
		
		Player cPlayer = new Translator("yaoming");
		cPlayer.attack();
		cPlayer.defense();
	}
	
}
