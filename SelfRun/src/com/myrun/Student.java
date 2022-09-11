package com.myrun;

public class Student
{
	int rno;
	String sname;
	String cname="ByPass";

	Student()
	{
		System.out.println("Default Parameter.");
		rno=10;
		sname="AaBbCc";
		
		
	}
	Student(int rno,String sname)
	{
		this();
		this.rno=rno;
		this.sname=sname;
		
	}
	void display()
	{
		System.out.println("Roll no="+rno);
		System.out.println("Student  Name="+sname);
		System.out.println("Cname is="+cname);
		
		
	}
}
