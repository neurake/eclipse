package com.myrun;

import java.util.Arrays;
import java.util.Scanner;

public class PBLPIN {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("first no:");
		int input1=sc.nextInt();
		System.out.println("Second no:");
		int input2=sc.nextInt();
		System.out.println("Third no:");
		int input3=sc.nextInt();
		System.out.println("Fourth no:");
		int input4=sc.nextInt();
		int arr1[]= new int[4];
		int arr2[]= new int[4];
		int arr3[]= new int[4];
		int i=0;
		while(input1>0)	
		{
			arr1[i]=input1%10;
			input1=input1/10;
				i++;
		}
		i=0;
		while(input2>0)	
		{
			arr2[i]=input2%10;
			input2=input2/10;
			i++;	
		}
		i=0;
		while(input3>0)	
		{
			arr3[i]=input3%10;
			input3=input3/10;
			i++;	
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		int sum=((arr1[0]*arr1[3])+(arr2[0]*arr2[3])+(arr3[0]*arr3[3]))-input4;
		System.out.println(sum);
		
		
	}

}
