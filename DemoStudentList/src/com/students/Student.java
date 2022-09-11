package com.students;

public class Student implements Comparable
{
	
	private int rno;
	private String sname;
	private String saddress;
	
	public Student() {
		super();
		
	}
	public Student(int rno, String sname, String saddress) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.saddress = saddress;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		
		return 0;
	}
	

}
