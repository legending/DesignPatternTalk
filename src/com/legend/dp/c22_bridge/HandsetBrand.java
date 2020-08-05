package com.legend.dp.c22_bridge;

public abstract class HandsetBrand {

	protected HandsetSoft soft;
	
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
	
}
