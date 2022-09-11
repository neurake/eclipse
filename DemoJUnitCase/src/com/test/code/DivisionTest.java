package com.test.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		Division obj=new Division();
		assertEquals(2,obj.divide(30, 15) );
	}

}
