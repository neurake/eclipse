package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		Set<String>cities=new TreeSet<String>();
		cities.add("Latur");
		cities.add("Nagpur");
		cities.add("Mumbai");
		cities.add("Latur");
		cities.add("Ausa");
		cities.add("Ausb");
		cities.remove("Ausb");
		
		Iterator it=cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
