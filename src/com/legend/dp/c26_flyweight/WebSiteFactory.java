package com.legend.dp.c26_flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
	
	private Map<String, Object> flyweights = new HashMap<>();
	
	public WebSite getWebSiteCategory(String key) {
		if(!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite) flyweights.get(key);
	}
	
	public int getWebSiteCount() {
		return flyweights.size();
	}

}
