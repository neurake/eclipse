package com.myrun;

import java.util.Scanner;

public class MettleAs2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input:");
		String input1=sc.nextLine();
		
		int sum=0;
		int ans=0;
		String s[]=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			sum+=s[i].length();
		}
		while(sum>0)
		{
			int rem=sum%10;
			ans+=rem;
			sum=sum/10;
			
		}
		System.out.println(ans);

	}

}
