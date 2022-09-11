package com.myrun;

import java.util.Scanner;

public class PBL2 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("first no:");
		int input1=sc.nextInt();
		System.out.println("second no:");
		int input2=sc.nextInt();
		System.out.println("third no:");
		int input3=sc.nextInt();
		System.out.println("fourth no:");
		int input4=sc.nextInt();
		System.out.println("fifth no:");
		int input5=sc.nextInt();
		int h1[]=new int[10];
		int h2[]=new int[10];
		int h3[]=new int[10];
		int h4[]=new int[10];
		int h5[]=new int[10];
		
		int t1=input1;
		int t2=input2;
		int t3=input3;
		int t4=input4;
		int t5=input5;
		int i;
		
		while(input1>0)
		{
			h1[input1%10]++;
			input1/=10;
			
		}
		while(input2>0)
		{
			h2[input2%10]++;
			input2/=10;
			
		}
		while(input3>0)
		{
			h3[input3%10]++;
			input3/=10;
			
		}
		while(input4>0)
		{
			h4[input4%10]++;
			input4/=10;
			
		}
		while(input5>0)
		{
			h5[input5%10]++;
			input5/=10;
			
		}
		int c=0;
		int stable=0;
		int flag=0;
		int mark=0;
		for( i=0;i<10;i++)
		{
			if(h1[i]==1)
			{
				mark=1;
				continue;
			}
				
			if(mark==0&&h1[i]%2!=0)
			{
				flag=1;
				
			}
		}
		
		if(flag==0)
		{
			stable+=t1;
		}
		
		
		
		flag=0;
		 mark=0;
		for( i=0;i<10;i++)
		{
			if(h2[i]==1)
			{
				mark=1;
				continue;
			}
				
			if(mark==0&&h2[i]%2!=0)
			{
				flag=1;
				
			}
		}
		
		if(flag==0)
		{
			stable+=t2;
		}
		
		flag=0;
		mark=0;
		for( i=0;i<10;i++)
		{
			if(h3[i]==1)
			{
				mark=1;
				continue;
			}
				
			if(mark==0&&h3[i]%2!=0)
			{
				flag=1;
				
			}
		}
		
		if(flag==0)
		{
			stable+=t3;
		}
		
		
		flag=0;
		mark=0;
		for( i=0;i<10;i++)
		{
			if(h4[i]==1)
			{
				mark=1;
				continue;
			}
				
			if(mark==0&&h4[i]%2!=0)
			{
				flag=1;
				
			}
		}
		
		if(flag==0)
		{
			stable+=t4;
		}
		
		
		flag=0;
		mark=0;
		for( i=0;i<10;i++)
		{
			if(h5[i]==1)
			{
				mark=1;
				continue;
			}
				
			if(mark==0&&h5[i]%2!=0)
			{
				flag=1;
				
			}
		}
		
		if(flag==0)
		{
			stable+=t5;
		}
		System.out.println(stable);
		
		
		
		

	}

}
