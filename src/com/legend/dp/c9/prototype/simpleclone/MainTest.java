package com.legend.dp.c9.prototype.simpleclone;

import java.util.ArrayList;

/*
 * 当前实例：原型模式--浅拷贝
 * 适用场景：一个对象要供其他对象调用，且内容始终不变
 * 好处：速度快，因为只是复制引用
 * 特点：要实现Cloneable类
 * */

public class MainTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> phoneList = new ArrayList<>();
		phoneList.add("18888888888");
		phoneList.add("18666666666");
		
		WorkExperience experience = new WorkExperience("baidu", "2years");
		
		Resume resume1 = new Resume("xiao ming");
		resume1.setPersonal(22, phoneList, experience);
		resume1.display();
		
		Resume resume2 = resume1.clone();
		resume2.setName("xiao zhang");
		resume2.setWork("huashuo", "22years");
		resume2.phoneList.add("1366666666");
		resume2.display();
		
		resume1.display();
	}
}
