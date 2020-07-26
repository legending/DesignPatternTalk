package c15.abstractfactory;

/*
* 当前示例：工厂方法-->模拟数据库与数据库操作
* 适用场景：
* */

public class MainTest {
	
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
		IFactory factory = new AccessFactory();
		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.query(1);
		System.out.println("----------------------");
		
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.query(1);
	}
	
	

}
