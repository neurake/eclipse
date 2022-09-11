package com.demo.practice;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.practice .TestSort;

public class TestSortTest {

	@Test
	public void test() {
		TestSort obj=new TestSort();
		assertEquals(30,obj.sortValues(30,15));
	}

}
