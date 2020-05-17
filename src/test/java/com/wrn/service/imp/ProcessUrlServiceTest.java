package com.wrn.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wrn.service.IProcessUrlService;
import com.wrn.service.imp.ProcessUrlService;

public class ProcessUrlServiceTest {

	private final String longURL = "https://www.google.com/search?q=bolinhas+cor+de+rosa&oq=bolinhas+cor+de+rosa&aqs=chrome..69i57.4473j0j7&sourceid=chrome&ie=UTF-8"; 

	@Test
	public void testGetShortenUrl() {
		IProcessUrlService service = new ProcessUrlService();
		String url = service.getShortenUrl(longURL);
		assertTrue(longURL.length() > url.length());
	}
	
	@Test
	public void testRemoveNoNumeric() {
		IProcessUrlService service = new ProcessUrlService();
		String url = service.getShortenUrl(longURL);
		assertFalse(url.contains("-"));
	}
}
