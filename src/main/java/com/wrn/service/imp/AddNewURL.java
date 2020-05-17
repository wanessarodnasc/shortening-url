package com.wrn.service.imp;

import java.util.UUID;
import java.util.logging.Logger;

import com.wrn.config.UrlStorage;
import com.wrn.exception.BussinessExeption;

public class AddNewURL {

	private static final Logger LOGGER = Logger.getLogger(AddNewURL.class.getName());

	public String addNewUrl(String originalUrl) {
		String shortnerUrl = getShortUrl(originalUrl);
		UrlStorage.setUrl(originalUrl, shortnerUrl);
		return shortnerUrl;
	}

	private String getShortUrl(String originalUrl) {
		try {
			String host = formatHost(originalUrl);
			return getHashCode(host, 0);
		} catch (BussinessExeption e) {
			return e.getMessage();
		}
	}

	private String getHashCode(String host, int count) throws BussinessExeption {
		Integer hashCode = UUID.randomUUID().hashCode();
		String completedUrl = host.concat(hashCode.toString());
		while (UrlStorage.getUrl().values().contains(completedUrl)) {
			getHashCode(host, count);
			LOGGER.info("Hash code repeat : ".concat(hashCode.toString()));
			if (count > 5) {
				LOGGER.severe("Hash repeat more tha five times");
				throw new BussinessExeption(MessageEnum.ERROR.getDescription());
			}
			count++;
		}
		return hashCode.toString().replace("-", "");
	}

	private String formatHost(String shortnerUrl) {
		String[] urlSplited = shortnerUrl.split("/");
		//O(1)
		return String.format("%s//%s/", urlSplited[0], urlSplited[2]);
	}
}
