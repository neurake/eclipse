package com.myrun;

import java.util.Arrays;
import java.util.Scanner;

public class PBL4MY {
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
		
		int t1=input1;
		int t2=input2;
		int t3=input3;
		int t4=input4;
		int t5=input5;
		int flag=0;
		int stable=0;
		int unstable=0;
		
		int arr[]=new int[] {input1,input2,input3,input4,input5};
		for(int i=0;i<5;i++)
		{	
			
			int no[]=new int [10];
			int temp=arr[i];
			flag=0;
			while(temp>0)
			{
				int rem=temp%10;
				no[rem]++;
				temp=temp/10;
			}
			Arrays.sort(no);
			if(no[9]==1)
			{
				stable+=arr[i];
				continue;
			}
			else
			{	for(int j=0;j<9;j++)
				{
					if(no[j]!=0&&no[j]!=no[j+1])
					{
					flag=1;
					}
				
				}
				if(flag==0)
					stable+=arr[i];
				else
					unstable+=arr[i];
					
			}		
		}
		System.out.println("Stable="+stable);
		System.out.println("UNStable="+unstable);
		
		
		
	}

}
