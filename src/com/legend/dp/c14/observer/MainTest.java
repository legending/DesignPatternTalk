package com.legend.dp.c14.observer;

/*
 * 当前实例：观察者模式（发布订阅模式）
 * 适用场景：当一个对象的改变需要同时改变其他对象，并且他不知道具体有多少对象有待改变时
 * 好处：解耦（观察者与被观察者都是继承抽象父类而来，且被观察者不需要知道观察者的存在）
 * 特点：所有观察者都会接收到状态变化通知，而且观察者执行的方法名必须一样
 * */

/*
 * 当前示例：观察者模式（发布订阅模式）
 * 定义：定义了一种一对多的依赖关系，让多个观察者同时监听一个主题对象，当这个主题对象的状态发生改变时会通知所有观察者，使它们能自动更新自己
 * 适用场景：当一个对象的状态改变，另外一些对象需要对应变化，而且主题对象不需要知道有多少对象需要跟着变化的时候
 * 特点：降低了耦合，不过要求方法名必须相同，然后客户端不能指定哪些对象可以收到通知-->使用事件委托
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
