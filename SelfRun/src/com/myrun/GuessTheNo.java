package com.myrun;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter p:");
		int n1=sc.nextInt();
		System.out.println("Enter r:");
		int n2=sc.nextInt();
		System.out.println("Enter x:");
		int x=sc.nextInt();
		int count=0;
		int arr[]=new int[n2-n1];
		for(int i=n1,j=0;i<n2;i++)
		{
			int temp=i;
			int sum=0;
			while(temp>0)
			{
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
				
			}
			if(sum==x)
			{
				count++;
				arr[j]=i;
				j++;
			}
		
		}
		int arr1[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr1[i]=arr[i];
		}
		int n=count-1;
		Arrays.sort(arr1);
		System.out.println("public key:"+arr1[0]);
		System.out.println("public key:"+arr1[n]);
		
	
	}

}
