package com.students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList  //implements Comparable
{

	
	

	public static void main(String[] args) {
	List  slist= new ArrayList ();			//storing data of Student datatype
	Student s1=new Student(101,"XYZ","Latur");
	Student s2=new Student(102,"ABC","Pune");
	Student s3=new Student(103,"PQR","Nagpur");
	slist.add(s1);
	slist.add(s2);
	slist.add(s3);
	Employee e1=new Employee(1001);
	slist.add(e1);
	
	
	
	
	Iterator it=slist.iterator();
	while(it.hasNext())
	{
		Student stud=(Student)it.next();
		System.out.println(stud.getRno()+" "+stud.getSname()+" "+stud.getSaddress()); 
		
	}
//	for(Object s:slist)
//	{
//		Student stud=(Student)s;
//		System.out.println(stud.getRno()+" "+stud.getSname()+" "+stud.getSaddress());
//	}
	
	
	}

}
