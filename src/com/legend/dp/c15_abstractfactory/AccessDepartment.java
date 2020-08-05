package com.legend.dp.c15_abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在Access中插入一条department数据");
	}

	@Override
	public Department query(int id) {
		System.out.println("在Access中查询一条department数据");
		return null;
	}

}
