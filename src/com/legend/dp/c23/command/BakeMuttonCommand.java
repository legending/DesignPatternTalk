package com.legend.dp.c23.command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExecuteCommand() {
		receiver.BakeMutton();
	}
	
}
