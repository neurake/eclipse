package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
	public static void main(String args[])
	{
		TreeMap datatree =new TreeMap();
		datatree.put("Ramesh",60);
		datatree.put("Anil", 20);
		datatree.put("sham", 50);
		datatree.put("Ram", 65);
		datatree.put("sham", 70);
		
		
		Set dataset=datatree.entrySet();
		Iterator it =dataset.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
