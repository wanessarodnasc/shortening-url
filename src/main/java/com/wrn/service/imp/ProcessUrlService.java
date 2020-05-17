package com.wrn.service.imp;

import com.wrn.service.IProcessUrlService;

public class ProcessUrlService implements IProcessUrlService{

	@Override
	public String getShortenUrl(String originalUrl) {
		String shortUrl = new SearchURL().getShortUrlSearchByLongUrl(originalUrl);
		return isNotBlankOrNull(shortUrl) ? shortUrl : new AddNewURL().addNewUrl(originalUrl);
	}

	private boolean isNotBlankOrNull(String shortUrl) {
		return shortUrl != null && !shortUrl.equals("");
	}
}