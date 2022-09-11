package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<Integer,String> cities=new HashMap<Integer, String>();
		cities.put(4574,"latur");
		cities.put(7894, "pune");
		cities.put(1234, "Nagpur");
		cities.put(3456, "Mumbai");
		
		Set cset=cities.entrySet();  //convert map to set
		Iterator it=cset.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();    //Entry is array that store both key and value 
			//it.next return object
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
