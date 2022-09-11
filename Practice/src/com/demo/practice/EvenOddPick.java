package com.demo.practice;

public class EvenOddPick {

	
	
	
	int n=input1.length();
	String s="";
	char ch;
	if(n%2==0)
	{
		ch=input1.charAt(0);
		s=s+ch;
		for(int i=1;i<n;i++)
		{
			ch=input1.charAt(i);
			s=s+ch;
			i++;
		}
	}
	else
	{	ch=input1.charAt(0);
		s=s+ch;
		for(int i=2;i<n;i++)
		{
			ch=input1.charAt(i);
			s=s+ch;
			i++;
		}
	}
	return s;
}
