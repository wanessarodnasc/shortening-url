package com.wrn.config;

import java.util.HashMap;
import java.util.Map;

public class UrlStorage {
	
	private static Map<String, String> mapUrl = new HashMap<>();

	private UrlStorage() {
	}
	
	public static Map<String, String> getUrl(){
		return mapUrl;
	}
	
	public static synchronized void setUrl(String longUrl, String shortnerUrl) {
		//O(1)
		mapUrl.put(longUrl, shortnerUrl);
	}
}
