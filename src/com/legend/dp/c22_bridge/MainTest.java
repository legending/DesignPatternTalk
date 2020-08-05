package com.legend.dp.c22_bridge;

/*
 * 当前示例：桥接模式----手机与手机软件
 * 定义：实现一个系统可能有多个分类角度，而且每个角度都可能变化，那么久把这多个角度分离出来让它们独立变化，减少耦合
 * 适用场景：使用继承关系时需要反复修改去实现新增功能的时候
 * 特点：体现了组合/聚合原则（尽量使用组合/聚合而不是上来就考虑继承），降低了耦合，更能适应新的变化
 * */

public class MainTest {

	public static void main(String[] args) {
		HandsetBrand ab;
		ab = new HandsetBrandN();
		ab.setHandsetSoft(new HandsetGame());
		ab.run();

		ab.setHandsetSoft(new HandsetContactList());
		ab.run();
	}
	
}
