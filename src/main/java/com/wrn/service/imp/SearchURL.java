package com.wrn.service.imp;

import java.util.Map.Entry;

import com.wrn.config.UrlStorage;

public class SearchURL {

	public String getShortUrlSearchByLongUrl(String originalUrl) {
		return UrlStorage.getUrl().get(originalUrl);
	}

	public String getLongUrlSearchByShortnerUrl(String shortenUrl) {
		//O(Log n)
		for(Entry<String, String> url: UrlStorage.getUrl().entrySet()) {
			if(url.getValue().equals(shortenUrl)) {
				return url.getKey();
			}
		}
		return MessageEnum.DOES_NOT_EXIST.getDescription();
	}
}
