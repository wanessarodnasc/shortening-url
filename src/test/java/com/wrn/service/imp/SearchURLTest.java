package com.wrn.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wrn.config.UrlStorage;
import com.wrn.service.imp.MessageEnum;
import com.wrn.service.imp.SearchURL;

public class SearchURLTest {
	
	private final String longURL = "https://www.google.com/search?q=bolinhas+cor+de+rosa&oq=bolinhas+cor+de+rosa&aqs=chrome..69i57.4473j0j7&sourceid=chrome&ie=UTF-8"; 

	private final String shortUrl = "https://www.google.com/12345";


	@Test
	public void testShortUrlSearchByLongUrl() {
		SearchURL search = new SearchURL();
		UrlStorage.setUrl(longURL, shortUrl);
		String returnedUrl = search.getShortUrlSearchByLongUrl(longURL);
		assertEquals(shortUrl, returnedUrl);
	}

	@Test
	public void testSearchShortUrl() {
		SearchURL search = new SearchURL();
		UrlStorage.setUrl(longURL, shortUrl);
		String returnedUrl = search.getLongUrlSearchByShortnerUrl(shortUrl);
		assertEquals(longURL, returnedUrl);
	}
	
	@Test
	public void testSearchShortUrlDoesNotExist() {
		SearchURL search = new SearchURL();
		UrlStorage.setUrl(longURL, shortUrl);
		String returnedUrl = search.getLongUrlSearchByShortnerUrl(shortUrl.concat("123456"));
		assertEquals(MessageEnum.DOES_NOT_EXIST.getDescription(), returnedUrl);
	}
}
