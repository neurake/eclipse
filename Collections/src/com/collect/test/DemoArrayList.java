package com.collect.test;

import java.util.ArrayList;

public class DemoArrayList {
 
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("abc");
		list.add("pdr");
		list.add("vft");
		list.add("wesd");
		System.out.println(list);
		
		list.add(1,"bst");   //method overloading here
		System.out.println(list);
		
		
		ArrayList<String> newlist =new ArrayList<String>();
		newlist.add("45");
		newlist.add("56");
		System.out.println(newlist);
		
		list.addAll(newlist);   //add entire list  
		System.out.println(list);
		
		System.out.println(list.get(1));  //gets element by index
		
		

	}

}
