package com.myrun;

import java.util.Scanner;

public class FirstRepeat {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter no of array elements:");
		int input2=sc.nextInt(); 
		int input1[]=new int[input2];
		System.out.println("Enter array:");
		for(int i=0;i<input2;i++)
		{
			System.out.println("Enter element:"+(i+1)+":");
			input1[i]=sc.nextInt();
			
		}
		int no=0;
		int flag=0;
		for(int i=input1.length-1;i>=0;i--)
		{
			if(input1[i]<=0)
				continue;
			int temp=input1[i];
			for(int j=0;j<i;j++)
			{
				if(input1[j]==temp)
				{
					no=temp;
					flag=1;
					break;
				}
			}
			if(no!=0)
			{
				break;
			}
			
		}
		if(input1[input2-1]>0&&flag==0)
			System.out.println(input1[input2-1]);
		else
		System.out.println(no);
		
	}

}
