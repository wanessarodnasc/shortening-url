package com.wrn.service.imp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wrn.service.imp.MessageEnum;

public class MenssageEnumTest {

	@Test
	public void testGetDescription() {
		assertEquals("Does not exist", MessageEnum.DOES_NOT_EXIST.getDescription());
	}
}
