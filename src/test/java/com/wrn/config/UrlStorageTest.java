package com.wrn.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.wrn.config.UrlStorage;

public class UrlStorageTest {
	
	private final String longURL = "https://www.google.com/search?q=bolinhas+cor+de+rosa&oq=bolinhas+cor+de+rosa&aqs=chrome..69i57.4473j0j7&sourceid=chrome&ie=UTF-8"; 

	private final String shortUrl = "https://www.google.com/12345";
	
	@Test
	public void testUrl() {
		UrlStorage.setUrl(longURL, shortUrl);
		Map<String, String> url = UrlStorage.getUrl();
		for(Entry<String, String> urlValue : url.entrySet()) {
			assertEquals(longURL, urlValue.getKey());
			assertEquals(shortUrl, urlValue.getValue());
		}
		assertNotNull(url);
	}
}
