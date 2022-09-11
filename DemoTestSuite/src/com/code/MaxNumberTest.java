package com.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxNumberTest {
	
	MaxNumber obj=new MaxNumber();
	int elements[]= {78,25,45,90,65,3,40};
	@Test
	public void testFindMax() {
		assertEquals(90, obj.findMax(elements));
	}

	@Test
	public void testFindMin() {
		assertEquals(3, obj.findMin(elements));
	}

}
