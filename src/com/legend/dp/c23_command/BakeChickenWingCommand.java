package com.legend.dp.c23_command;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExecuteCommand() {
		receiver.BakeChickenWing();
	}
}
