package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashTable {

	public static void main(String[] args) {

		Hashtable <String, Double> datamap=new Hashtable<String,Double>();
		datamap.put("Ganesh", 25000.00);
		datamap.put("ajay", 78000.50);
		datamap.put("Anil", 10000.20);
		
		System.out.println(datamap.get("ajay"));
	
		
		Set dataset=datamap.entrySet();
		
		Iterator it =dataset.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+" "+me.getValue());
			
		}
	}

}
