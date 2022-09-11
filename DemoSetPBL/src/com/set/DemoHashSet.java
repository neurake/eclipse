package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet<Integer> dataset=new HashSet<Integer>();
		dataset.add(4);
		dataset.add(2);
		dataset.add(5);
		dataset.add(7);
		dataset.add(4);
		dataset.add(79);
		dataset.add(46);
		dataset.add(17);
		dataset.add(14);
		
		Iterator it=dataset.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			System.out.println(i);
		}
		
	}

}
