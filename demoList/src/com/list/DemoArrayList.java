package com.list;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Latur");
		list.add("Pune");
		list.add("Latur");
		list.add("Nagpur");
		System.out.println("Size is"+list.size());
		System.out.println("Pune is present  "+list.contains("Pune"));
		list.remove("Pune");
		System.out.println("Size after removing:"+list.size());
		System.out.println(list.get(2));
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println("list is"+list);
		list.clear();
		System.out.println("list is"+list);
	}

}
