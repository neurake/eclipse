 package com.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.beans.Student;

public class DemoTreeSet {

	public static void main(String[] args) {
//		TreeSet<String> dataset=new TreeSet<String>();
//		dataset.add("one");
//		dataset.add("two");
//		dataset.add("three");
//		dataset.add("four");
//		dataset.add("five");
//		dataset.add("five");
//		//dataset.add(null);
//		dataset.add("one");
//		
		
//		
//		Iterator it=dataset.iterator();
//		while(it.hasNext())
//		{
//			String s=(String)it.next();
//			System.out.println(s);
//		}
		
		
		
		TreeSet <Student> dataset=new TreeSet<Student>();
		dataset.add(new Student(1,"Ganesh",45));
		dataset.add(new Student(2,"Ajay",25));
		dataset.add(new Student(3,"Mavi",75));
		dataset.add(new Student(4,"Sunil",85));
		
		
		Iterator it =dataset.iterator();
		while(it.hasNext())
			{
				Student s=(Student)it.next();
				System.out.println(s.getRno()+" "+s.getSname()+" "+s.getMarks());
		}
		
	}

}
