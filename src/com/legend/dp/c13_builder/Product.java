package com.legend.dp.c13_builder;

import java.util.ArrayList;

public class Product {

	public ArrayList<String> parts = new ArrayList<>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		for(String part: parts) {
			System.out.println(part + " ");
		}
	}
	
}
