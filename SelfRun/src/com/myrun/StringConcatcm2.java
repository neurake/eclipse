package com.myrun;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringConcatcm2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1:");
		String s1=sc.nextLine();
		System.out.println("Enter string2:");
		String s2=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1+s2);
		String s=sb.toString();
		System.out.println(s);
		char str[]=s.toCharArray();
		
		int n=str.length;
		System.out.println(n);
		int count=0;
		for(int i=1;i<n;i++)
		{
			
			if(str[i]==' ')
			{
				count++;
				
			}
			 
				
			
		}
		
		System.out.println(count);
		
		
		

	}

}
