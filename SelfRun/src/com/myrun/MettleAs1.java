package com.myrun;

import java.util.Scanner;

public class MettleAs1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of String:");
		String input1=sc.nextLine();
		input1=input1.toUpperCase();
		int esum=0;
		int sum=0;
		String emp="";
		String s[]=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String temp=s[i];
			esum=0;
			System.out.println(temp.length());
			int len=temp.length();
			int lensum[]=new int[len];

			for(int j=0;j<len;j++)
			{
				char ch=temp.charAt(j);
				int no=(int)ch-64;
				lensum[j]=no;
				System.out.print(no +" ");
			}
			if(len%2==0)
				{
					for(int j=0;j<len/2;j++)
					{
						sum=lensum[j]-lensum[(len-1)-j];
						if(sum<0)
						sum=-sum;
						esum+=sum;
						

					}
					System.out.println("esum="+esum);
				}
			else
			{

				for(int j=0;j<(len/2);j++)
					{
						sum=lensum[j]-lensum[(len-1)-j];
						if(sum<0)
						sum=-sum;
						esum+=sum;

					}
					esum+=lensum[(len/2)];
					System.out.println("esum="+esum);


			}
			emp+=esum;
			

		}  
		
	   
		System.out.println(emp);
		

	}

}
