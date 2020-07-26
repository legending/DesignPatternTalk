package c6.decorate1;

/*
* 当前示例：装饰器模式
* 适用场景：动态地为一个对象添加职责
* 好处：把类的装饰功能从类中移除，从而简化原有的类
* 特点：组件类（父子）+装饰类（包含两层继承关系：DecorateA/B extends Decorate, Decorate extends Component）
* */

public class MainTest {
	
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		DecorateA d1 = new DecorateA();
		DecorateB d2 = new DecorateB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}

}
