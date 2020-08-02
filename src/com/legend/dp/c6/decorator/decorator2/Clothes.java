package com.legend.dp.c6.decorator.decorator2;

public class Clothes extends Person {

	protected Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void show() {
		person.show();
	}

}
