package com.legend.dp.c15.abstractfactory;

/*
 * 当前示例：抽象工厂模式-->模拟不同数据数据库访问
 * 定义：依赖或关联关系止于接口，不关注具体实现类
 * 适用场景：要根据不同的需求创建不同的对象，但创建的流程一致（工厂，商品接口中的方法不变）
 * 特点：充分体现了依赖倒转原则与开放封闭原则，但是如果要工厂接口，工厂实现类，商品接口，商品实现类都要改动
* */

public class MainTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		/*User user = new User();
		Department department = new Department();
		
		IFactory factory = new AccessFactory();
		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.query(1);
		System.out.println("----------------------");
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.query(1);*/

        //反射+抽象工厂
		/*String db = "Access";//SqlServer
		String className = "c15.abstractfactory." + db + "Factory";
		User user = new User();
		IFactory factory = (IFactory)Class.forName(className).newInstance();
		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.query(1);
		System.out.println("----------------------");
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.query(1);*/

        //配置文件+反射
		/*ResourceBundle rb = ResourceBundle.getBundle("c15.abstractfactory.config", Locale.ENGLISH);
		String db = rb.getString("db");//SqlServer
		String className = "c15.abstractfactory." + db + "Factory";
		User user = new User();
		IFactory factory = (IFactory)Class.forName(className).newInstance();
		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.query(1);
		System.out.println("----------------------");
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.query(1);*/

        //简单工厂模式+反射+配置文件
        User user = new User();
        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.query(1);
        System.out.println("----------------------");
        IDepartment iDepartment = DataAccess.createDepartment();
		iDepartment.query(1);
	}
}
