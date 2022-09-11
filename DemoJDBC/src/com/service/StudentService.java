package com.service;

import java.util.Scanner;

import com.DAO.StudentDao;
import com.beans.Student;

public class StudentService {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		System.out.println("Enter the stud_id to access:");
		Scanner sc=new Scanner(System.in);
		int sid=sc.nextInt();
		Student s=dao.getStudent(sid);
		if(s!=null)
		{
			System.out.println("Student id= "+s.getStudId()+"\nStudent Name= "+s.getStudname()+"\nStudent Address="+s.getStudAddress());
			
		}
		else
			System.out.println("student record not found");
		
//		System.out.println("Insert data into database:");
//		Student s1=dao.insertStudent();
	
	
//	Student stud=new Student (107,"Rana","Terapur");
//	if(dao.insertStudent(stud))
//	{
//		System.out.println("Student record inserted");
//	}
//	else
//	{
//		System.out.println("unable to insert Student Record");
//	}
//	
		
//	Student s=new Student(102,"Anil","Nagpur");
//	if(dao.updateStudent(s))
//	{
//		System.out.println("Student Record Updated ");
//	}
//	else 
//	{
//		System.out.println("Unable to attend student record");
//	}
	
//	if(dao.deleteStudent(106))
//	{
//		System.out.println("Student Record Deleted ");
//	}
//	else 
//	{
//		System.out.println("Unable to delete student record");
//	}
	
	
	}

}
