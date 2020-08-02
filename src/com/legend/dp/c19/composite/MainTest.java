package com.legend.dp.c19.composite;

/*
 * 当前示例：组合模式
 * 定义：将对象组合成树形结构用以表示`部分-整体`的层级关系，组合模式使得用户对单个对象和组合对象的使用具有一致性
 * 适用场景：需求中出现部分与整体的层次结构时，以及希望用户忽略组合对象与单个对象的不同，统一使用组合结构中的所有对象时
 * 特点：基本对象可以组成复杂的对象，复杂的对象又可以被组合，可以反复递归，同时可以使用户以同样的方式使用单个对象与组合对象
 * */

public class MainTest {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany comp = new ConcreteCompany("上海分公司");
		comp.add(new HRDepartment("上海分公司人力资源部"));
		comp.add(new FinanceDepartment("上海分公司财务部"));
		root.add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
		comp1.add(new HRDepartment("南京办事处人力资源部"));
		comp.add(comp1);

        root.display(1);
		System.out.println("-------------");
		root.duty();
	}
}
