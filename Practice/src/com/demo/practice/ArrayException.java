package com.demo.practice;
import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in the array:");
		int no=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the array index of  element you want to access:");
		int ino=sc.nextInt();
		try {
		
			
			System.out.println("Element is:"+arr[ino]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			
			
				System.out.println("Array element is not found");
			
		}
		
		
	}

}
