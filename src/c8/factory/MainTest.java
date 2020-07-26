package c8.factory;

/*
* 当前实例：工厂方法模式-->雷锋接班人
* 适用场景：反复大量创建某些实例
* 好处：简单工厂模式里的判断逻辑放在了客户端，实现了开放封闭原则（对扩展开放，对修改封闭），如果是简单工厂，增加一个产品就要修改factory，而现在只需要更改客户端的调用路基
* 特点：产品是一父多子，工厂是一个接口多实现类
* */

public class MainTest {

	public static void main(String[] args) {
		IFactory factory = new VolunteerFactory();
		LeiFeng volunteer = factory.CreateLeiFeng();
		
		volunteer.maimi();
	}
	
}