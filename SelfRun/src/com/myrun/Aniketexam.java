package com.myrun;

import java.util.Scanner;

public class Aniketexam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test case:");
		int t=sc.nextInt();
		while(t>0)
		{
		System.out.print("Enter N:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter k:");
		int k=sc.nextInt();
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<k;i++)
		{	 temp=arr[n-1];
			for(int j=n-2;j>=0;j--)
			{	
				arr[j+1]=arr[j];
				
				
			}
			arr[0]=temp;
			 
		}
		
		System.out.println("Your  array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		t--;
		}
		

	}

}
