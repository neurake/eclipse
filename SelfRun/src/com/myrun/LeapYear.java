package com.myrun;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if(year%100==0)
		{
			year=year/100;
		
		}
		if(year%4==0)
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}	
		
		
	}

}
