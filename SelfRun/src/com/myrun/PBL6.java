package com.myrun;
import java.util.Scanner;
public class PBL6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		String str=""+n;
		int arr[]=new int[str.length()];
		int i=0;
		
		while(n>0)
		{
			int rem=n%10;
			arr[i]=rem;
			n=n/10;
			i++;
			
		}
		int sum=arr[0];
		for(int j=0;j<str.length()-1;j++)
		{
			System.out.println(arr[j]);
			int temp=arr[j];
			if(temp==0)
				temp=1;
			int mul=1;
			while(temp>0)
			{
				mul=mul*arr[j+1];
				temp--;
			}
			sum=sum+mul;
			System.out.println(sum);
		}
		
		System.out.println(sum);
		
		
	}

}
