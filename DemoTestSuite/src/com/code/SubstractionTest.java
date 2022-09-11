package com.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubstractionTest {

	@Test
	public void testSub() {
		Substraction obj=new Substraction();
		assertEquals(45, obj.sub(100,55));
	}

}
