package com.myrun;

import java.util.Scanner;

public class SaiExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter string");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int sum=0; 
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			int a=0;
			int b=1;
			int c=0;
			int n=ch-64;
			temp=0;
			if(n>=2)
			{
			for(int j=0;j<n-2;j++)
			{
				 c=a+b;
				a=b;
				b=c;
				
				
			}
			}
			else
			{
				c=a;
			}
			sum=sum+c;
			
			
		}
		
		
		System.out.println(sum);
		
		
	}

}

