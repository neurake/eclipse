package com.myrun;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no of array elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println("element "+i+" =");
			arr[i]=sc.nextInt();
		}
		System.out.print("Given array elements:=");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("Given Array:");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(arr));
		

	}

}
