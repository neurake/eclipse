package com.myrun;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	char ch='y';
	while(ch=='y'||ch=='Y')
	{
	System.out.println("Enter two numbers for additon:");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int sum=no1+no2;
		System.out.println("Addition="+sum);
		System.out.println("Enter y to continue or n to stop:");
		ch=sc.next().charAt(0);
		if(ch!='y'&&ch!='Y')
		{
			
			break;
		}
	}
	System.out.println("Thanks for visiting.");
	}

}
