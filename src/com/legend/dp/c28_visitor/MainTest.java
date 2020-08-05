package com.legend.dp.c28_visitor;

/*
 * 当前示例：访问者模式----男人女人的行动差异
 * 定义：给一个对象添加新的行为而不改变这个对象的类
 * 适用场景：适用于有稳定的数据结构，但是具有易于变化的数据操作
 * 特点：将数据结构与作用域数据结构的操作分开，不适用与数据结构经常变化的场景
 * */

public class MainTest {
	
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Success v1 = new Success();
		o.display(v1);
	}

}
