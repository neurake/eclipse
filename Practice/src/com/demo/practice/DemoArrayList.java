package com.demo.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("KGF");
		list.add("RRR");
		list.add("Pushpa");
		list.add("SpiderMan");
	
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//public void printall=
		
		
	}

}
