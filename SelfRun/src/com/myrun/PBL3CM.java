package com.myrun;

import java.util.Arrays;
import java.util.Scanner;

public class PBL3CM {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("first no:");
		int input1=sc.nextInt();
		System.out.println("Second no:");
		int input2=sc.nextInt();
		System.out.println("Third no:");
		int input3=sc.nextInt();
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int arr3[]=new int[3];
		int arr4[]=new int[3];
		int arr[]=new int[] {input1,input2,input3};
		for(int i=0;i<3;i++)
		{
			arr1[i]=arr[i]%10;
			arr[i]=arr[i]/10;
		}
		for(int i=0;i<3;i++)
		{
			arr2[i]=arr[i]%10;
			arr[i]=arr[i]/10;
		}
		for(int i=0;i<3;i++)
		{
			arr3[i]=arr[i]%10;
			arr[i]=arr[i]/10;
		}
		for(int i=0;i<3;i++)
		{
			arr4[i]=arr[i]%10;
			arr[i]=arr[i]/10;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		int sum=(arr4[2]-arr4[0])*1000+(arr3[2]-arr3[0])*100+(arr2[2]-arr2[0])*10+(arr1[2]-arr1[0]);
		System.out.print(sum);
		
		
		

	}

}
