package com.set;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		Set<Integer> bin=new HashSet<Integer>();
		bin.add(4512);
		bin.add(1234);
		bin.add(1525);
		bin.add(1111);
		bin.add(4512);
		
		System.out.println(bin);
		

	}

}
