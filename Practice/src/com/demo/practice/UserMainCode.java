package com.demo.practice;
import java.io.*;
import java.util.*;

public class UserMainCode{
	public static String returnTheModifiedSentence(String input1)
	{
		int n=input1.length();
//		String array[]=input1.split("");
		char ch;
		int count=0;
		for(int i=0;i<n;i++)
		{
			ch=input1.charAt(i);
			if(ch==' ')
			{
				count++;
			}
			
		}
		
		String s[]=new String[count+1];
		String currentString="";
		
		for(int j=0;j<count+1;j++)
		{
		for(int i=0;i<n;i++)
		{
			ch=input1.charAt(i);
			
			if(ch==' ')
			{
				s[j]=currentString;
				currentString="";
			}
			currentString=currentString+ch;
		}
		}
		
		
		for(int i=0;i<count+1;i++)
		{
			
			String temp="";
			int n1=s[i].length();
			char ch1,ch2;
			for(int k=0;k<n1;k++)
			{
				ch1=s[i].charAt(k);
				ch2=(char)((int)ch1+n1);
				temp=temp+ch2;
			} 
			
			s[i]=temp;
		}
		String s2="";
		for(int i=0;i<count+1;i++)
		{
			s2=s2+s[i];
		}
		
		
		return s2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1=returnTheModifiedSentence(s);
		System.out.println(s1);
		
	}

}

