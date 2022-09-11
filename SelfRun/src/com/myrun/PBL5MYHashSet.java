package com.myrun;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PBL5MYHashSet {

	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no1:");
		int input1=sc.nextInt();
		System.out.println("Enter the n2:");
		int input2=sc.nextInt();
		System.out.println("Enter the no3:");
		int input3=sc.nextInt();
		System.out.println("Enter the no4:");
		int input4=sc.nextInt();
		System.out.println("Enter the no5:");
		int input5=sc.nextInt();
		
		int stable=0;
		int unstable=0;
		int arr[]=new int[] {input1,input2,input3,input4,input5};
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int count=0;
			
			Set<Integer> hs=new HashSet<Integer>();
			while(temp>0)
			{
				int rem=temp%10;
				count++;
				hs.add(rem);
				temp=temp/10;
				
			}
			
			if(count%hs.size()==0)
				stable+=arr[i];
			else 
				unstable+=arr[i];
			
			
			
			
		}
		System.out.println("Stable="+stable);
		System.out.println("UnStable="+unstable);
	
	}
		
}
