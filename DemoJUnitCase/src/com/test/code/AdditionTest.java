package com.test.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAdd() {
		Addition obj=new Addition();
		assertEquals(45, obj.add(30,15));
	}

}
