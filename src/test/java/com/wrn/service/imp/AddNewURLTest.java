package com.wrn.service.imp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wrn.config.UrlStorage;
import com.wrn.service.imp.AddNewURL;

public class AddNewURLTest {
	
	private final String longURL = "https://www.google.com/search?q=bolinhas+cor+de+rosa&oq=bolinhas+cor+de+rosa&aqs=chrome..69i57.4473j0j7&sourceid=chrome&ie=UTF-8"; 

	@Test
	public void testAddNewUrl() {
		String url = new AddNewURL().addNewUrl(longURL);
		String expectedReturn = UrlStorage.getUrl().get(longURL);
		assertEquals(expectedReturn, url);
	}
}
