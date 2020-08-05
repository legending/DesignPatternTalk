package com.legend.dp.c15_abstractfactory;

public class AccessFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

}
