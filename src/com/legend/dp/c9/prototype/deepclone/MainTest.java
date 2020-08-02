package com.legend.dp.c9.prototype.deepclone;

/*
 * 当前实例：原型模式--深度拷贝
 * 适用场景：（1）产生一个对象需要消耗很多资源或者需要经历复杂的准备过程
 * 			（2）一个对象需要供给其他对象访问，且修改频繁
 * 好处：所有实例之间互不影响，可以独立修改
 * 特点：构造方法私有，最终产生一个独立的新对象
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
