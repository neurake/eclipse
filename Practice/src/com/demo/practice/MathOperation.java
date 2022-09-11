package com.demo.practice;

public class MathOperation {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int sum=0;
		try {
		for(int i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
		}
		}
		catch(ArrayIndexOutOfBoundsException  ex)
		{
			System.out.println("Enter array elements 5");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Enter array elements in number format only");
		}
	
		
		int avg=sum/arr.length;
		System.out.println("Sum of array="+sum);
		System.out.println("Avgerage of array="+avg);
		
	}

}
