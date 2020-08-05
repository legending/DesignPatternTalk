package com.legend.dp.c20_iterator;

/*
 * 当前示例：迭代模式
 * 定义：提供一种方法顺序访问一个聚合对象中的各个元素，而不暴露该对象的内部结构
 * 适用场景：当每次访问一个聚合对象，都需要遍历且多种遍历方式的时候
 * 特点：将遍历行为与集合分离，对外隐藏内部结构，可以有多种遍历方式
 * */

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		List<Object> test = new ArrayList<>();
		test.add(0, "大鸟");
		test.add(1, "小菜");
		test.add(2, "老外");
		
		a.setItems(test);
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()) {
			System.out.println(i.currentItem());
			i.next();
		}
        //对比java的Iterator
		/*List<String> lst = new ArrayList<String>();
		lst.add("aaa");
		lst.add("bbb");
		lst.add("ccc");
		lst.add("ddd");
		lst.add("eee");
		lst.add("fff");
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
	}
	
}
