package com.myrun;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int  temp;
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Element "+(i+1)+"=");
			arr[i]=sc.nextInt();
		}
		System.out.println("Your array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Element "+(i+1)+"="+arr[i]);
			
		}
		for(int i=0;i<n/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[(n-i-1)];
			arr[(n-i-1)]=temp;
			
		}
		System.out.println("The reversed Array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Element "+(i+1)+"="+arr[i]);
			
		}
		
		

	}

}
