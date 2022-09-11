package com.myrun;

import java.util.Scanner;

public class PBL7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		int sum=0;
		String str=""+n;
		int arr[]=new int [str.length()];
		int i=0;
		while(n>0)
		{
			int rem=n%10;
			arr[i]=rem;
			n=n/10;
			i++;
			
		}
		for(int j=0;j<str.length();j++)
		{
			sum=arr[j]*(str.length()-j)+sum;
		}
		System.out.println(sum); 

	}

}

