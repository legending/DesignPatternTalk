package com.legend.dp.c9_prototype.deepclone;

/*
 * 当前示例：原型模式-->简历深度拷贝
 * 定义：用原型实例指定创建对象的种类，然后通过拷贝这些原型创建新的对象-->javascript中没有类的概念，是真正的原型模式
 * 适用场景：创建对象的过程很复杂或者要频繁修改对象
 * 特点：隐藏了创建细节
 * */

import java.util.ArrayList;
public class MainTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> phoneList = new ArrayList<>();
		phoneList.add("18888888888");
		phoneList.add("18666666666");
		
		WorkExperience experience = new WorkExperience("baidu", "2years");
		
		Resume resume1 = new Resume("xiao ming");
		resume1.setPersonal(22, phoneList, experience);
		resume1.display();
		System.out.println("---------------------");
		
		Resume resume2 = resume1.clone();
		resume2.display();
		System.out.println("---------------------");
		
		resume2.setName("xiao zhang");
		resume2.setWork("huashuo", "22years");
		resume2.phoneList.add("1366666666");
		
		resume2.display();
		System.out.println("---------------------");
		
		resume1.display();
		System.out.println("---------------------");
	}

}
