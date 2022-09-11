package com.test.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxNumberTest {

	@Test
	public void test() {
		MaxNumber obj=new MaxNumber();
		assertEquals(30,obj.findMax(30, 15) );
	}

}
