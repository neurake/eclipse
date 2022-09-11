package com.myrun;
class Studentt
{
	static String cname;
	int rno;
	void print(String name)
	{
		String sname=name;
		System.out.println(rno+" "+sname+" "+cname);
	}
}

public class DemoVariable {

	public static void main(String[] args) {
		Studentt.cname="Cocsit";
		Studentt s1=new Studentt();
		s1.rno=10;
		s1.print("XYZ");
		Studentt s2=new Studentt ();
		s2.rno=30;
		s2.print("ABC");
		Studentt s3=new Studentt ();
		s3.rno=50;
		s3.print("PQR");
		

	}

}
