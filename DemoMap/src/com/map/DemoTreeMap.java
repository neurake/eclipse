package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		Map<Integer, String> cities=new TreeMap<Integer, String>();
		cities.put(1234, "Dubai");
		cities.put(3452, "Bejing");
		cities.put(2324, "Moscow");
		cities.put(4467, "Berlin");
		Set cset=cities.entrySet();
		
		Iterator it=cset.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		

	}

}
