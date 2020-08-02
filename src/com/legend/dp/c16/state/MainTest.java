package com.legend.dp.c16.state;

/*
 * 当前示例：状态模式-->不同时间工作状态不一样
 * 定义：当一个对象的状态改变时对应的行为也会随之改变，感觉像这个对象的类发生了改变
 * 适用场景：一个对象的状态转换的条件表达式太过复杂，这时候可以把判断逻辑转移到表示不同状态的一些列类中，可以把复杂的逻辑简单化
 * 特点：将不同状态的行为分割开来，体现了单一职责原则，开放封闭原则，降低了各种状态之间的相互依赖，简化了判断逻辑，便于扩展
 * */

public class MainTest {
	
	public static void main(String[] args) {
		Work work = new Work();
		
		work.setHour(13.5);
		work.WriteProgram();
		
		work.setHour(17);
		work.setFinish(true);
		work.WriteProgram();
	}
}