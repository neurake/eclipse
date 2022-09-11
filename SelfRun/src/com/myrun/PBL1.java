package com.myrun;

import java.util.Arrays;
import java.util.Scanner;

public class PBL1 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("first no:");
		int input1=sc.nextInt();
		System.out.println("Second no:");
		int input2=sc.nextInt();
		System.out.println("Third no:");
		int input3=sc.nextInt();
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		int arr3[]=new int[4];
		for(int i=0;i<4;i++)
		{
			arr1[i]=input1%10;
			input1=input1/10;
		}
		for(int i=0;i<4;i++)
		{
			arr2[i]=input2%10;
			input2=input2/10;
		}
		for(int i=0;i<4;i++)
		{
			arr3[i]=input3%10;
			input3=input3/10;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		int sum=arr1[3]+arr2[3]+arr3[3]-(arr1[0]+arr2[0]+arr3[0]);
		System.out.print(sum);
		
		
		

	}

}
