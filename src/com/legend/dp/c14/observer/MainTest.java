package com.legend.dp.c14.observer;

/*
 * 当前实例：观察者模式（发布订阅模式）
 * 适用场景：当一个对象的改变需要同时改变其他对象，并且他不知道具体有多少对象有待改变时
 * 好处：解耦（观察者与被观察者都是继承抽象父类而来，且被观察者不需要知道观察者的存在）
 * 特点：所有观察者都会接收到状态变化通知，而且观察者执行的方法名必须一样
 * */

public class MainTest {
	
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		
		s.setSubjectState("ABC");
		s.mynotify();
	}

}
