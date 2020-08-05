package com.legend.dp.c23_command;

public abstract class Command {
	
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	public abstract void ExecuteCommand();

}
