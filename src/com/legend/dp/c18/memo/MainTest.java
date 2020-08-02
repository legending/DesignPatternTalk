package com.legend.dp.c18.memo;

/*
 * 当前示例：备忘录模式（适配器分类适配器与对象适配器，因为java不支持多继承，所以这里主要是说对象适配器）-->姚明需要翻译
 * 定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便于后期可将对象恢复到保存的状态
 * 适用场景：适用于功能复杂，需要维护历史状态的类
 * 特点：目标类 + memo类 + memo包装类
 * */

public class MainTest {
	
	public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
		lixiaoyao.init();
		lixiaoyao.display();
		System.out.println("------------------------");

        RoleStateHolder stateHolder = new RoleStateHolder();
        stateHolder.setMemo(lixiaoyao.saveState());
		
		lixiaoyao.fight();
		lixiaoyao.display();
		System.out.println("------------------------");

        lixiaoyao.recoverState(stateHolder.getMemo());
		lixiaoyao.display();
	}

}
