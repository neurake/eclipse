package com.beans;

public class Student implements Comparable {
	private int  rno;
	private String sname;
	private int marks;
	public Student(int rno, String sname, int marks) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.marks = marks;
	}
	public int getRno() {
		return rno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(marks==s.marks)
			return 0;
		else if(marks<s.marks)
			return 1;
		else return -1;
		
	}
	
	
}
