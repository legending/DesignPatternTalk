package com.legend.dp.c6.decorator.decorator2;

/*
 * 当前示例：装饰模式-->靓仔穿衣
 * 适用场景：动态地为一个对象添加职责
 * 好处：把类的装饰功能从类中移除，从而简化原有的类
 * 特点：组件类（一父多子）+装饰类（包含两层继承关系：DecorateA/B extends Decorate, Decorate extends Component）
 * */

public class MainTest {
	
	public static void main(String[] args) {
		Person xiaoCai = new Person("小菜");
		TShirt tShirt = new TShirt();
		Shoes shoes = new Shoes();
		
		tShirt.setPerson(xiaoCai);
		shoes.setPerson(tShirt);
		shoes.show();
		
	}
	
}
