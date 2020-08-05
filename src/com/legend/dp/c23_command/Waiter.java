package com.legend.dp.c23_command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Command> orders = new ArrayList<Command>();

	public void setOrder(Command command) {
		if (command.toString().indexOf("BakeChickenWingCommand") != -1) {
			System.out.println("has no chicken wing");
		} else {
			orders.add(command);
		}
	}

	public void cancelOrder(Command command) {
		orders.remove(command);
	}

	public void mynotify() {
		for (Command command : orders) {
			command.ExecuteCommand();
		}
	}

}
