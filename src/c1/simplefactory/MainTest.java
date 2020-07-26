package c1.simplefactory;

/*
 * 当前示例：运算器工厂
 * 适用场景：需要大量反复创建某个类的实例
 * 好处：提高了代码的复用性，减少很多new对象的过程
 * 特点：两大类 工厂类+产品类（一父多子）
 * */

public class MainTest {

	public static void main(String[] args) {
		Operation operation = SimpleFactory.getOperation('+');
		operation.numA = 1.0;
		operation.numB = 2.2;
		double test = operation.getResult();
		System.out.println(test);
		System.out.println("----------------------------");
		
		Operation operation2 = SimpleFactory.getOperation('-');
		operation2.numA = 3.3;
		operation2.numB = 1.0;
		System.out.println(operation2.getResult());
		System.out.println("----------------------------");
		
		Operation operation3 = SimpleFactory.getOperation('*');
	}

}
