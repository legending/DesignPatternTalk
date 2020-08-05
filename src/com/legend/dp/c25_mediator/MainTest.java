package com.legend.dp.c25_mediator;

/*
 * 当前示例：中介模式----联合国处理国际事务
 * 定义：用一个恶中介对象来封装一系列对象交互，中介使得个对象不需要显示地相互引用，可以独立改变他们的交互，降低耦合
 * 适用场景：一组定义好的对象但是需要进行复杂通信的场合，以及增加多个对象需要同时交互的方法
 * 特点：集中化控制，一方面可以降低耦合，但另一方面增加了中介的复杂度
 * */

public class MainTest {
	
	public static void main(String[] args) {
		
		UNSC unsc = new UNSC();
		
		USA c1 = new USA(unsc);
		Iraq c2 = new Iraq(unsc);

		unsc.setColleague1(c1);
		unsc.setColleague2(c2);
		
		c1.declare("不准研究核武器，否则开战");
		c2.declare("我们没有核武器，也不怕侵略");
	}

}
