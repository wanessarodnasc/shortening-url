package com.wrn.exception;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wrn.exception.BussinessExeption;
import com.wrn.service.imp.MessageEnum;

public class BussinessExeptionTest {

	@Test
	public void testGetErrorMessage() {
		BussinessExeption msg = new BussinessExeption(MessageEnum.ERROR.getDescription());
		assertEquals("Error to redirect", msg.getErrorMessage());
	}
}
