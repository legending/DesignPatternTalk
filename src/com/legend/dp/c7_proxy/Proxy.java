package com.legend.dp.c7_proxy;

public class Proxy extends GiveGift {

	public Pursuit pursuit;
	
	public Proxy(Girl girl) {
		this.pursuit = new Pursuit(girl);
	}
	
	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveClothes() {
		pursuit.giveClothes();
	}

}