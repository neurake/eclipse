package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.beans.Employee;
import com.beans.Student;

public class ArrayListDemo {
	
	public static void main(String args[])
	{
		
		List<Student>  list =new ArrayList<Student>();
		list.add(new Student(101,"ABC"));
		list.add(new Student(102,"XYZ"));
		list.add(new Student(103,"PQR"));
		
		Iterator it=list.iterator();  
		while(it.hasNext())
		{
			Student s=(Student)it.next();
			System.out.println(s.getRno()+" "+s.getSname());
			
		}
		
		Student s1=(Student) list.get(1);
//		System.out.println(s1.getRno());
//		System.out.println(s1.getSname());
		
//		list.add(new Employee(1001,"Ganesh"));//store data if no generics
		
//		for(Object obj:list)
//		{
//			Student s=(Student)obj;
//			System.out.println(s.getRno());
//			System.out.println(s.getSname());
//		}
		
//		for(Student s:list)  //no need to cast the datatype as generics
//		{
//			
//			System.out.println(s.getRno());
//			System.out.println(s.getSname());
//		}
		
		
//		ArrayList list =new ArrayList();
//		list.add("Latur");
//		list.add("Pune");
//		list.add("Thane");
//		list.add("Latur");
//		list.remove("Pune");
//		for(Object s:list)   //list return object 
//		{
//			System.out.println((String )s);
//		}
		
//		String s=(String)list.get(1);
//		System.out.println(s);
	}

}
