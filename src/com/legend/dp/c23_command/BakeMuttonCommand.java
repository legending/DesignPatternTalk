package com.legend.dp.c23_command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExecuteCommand() {
		receiver.BakeMutton();
	}
	
}
