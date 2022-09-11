package com.demo.practice;

class AgeException extends Exception
{
	int age;
	AgeException(int age)
	{
		this.age=age;	
	}
	public String toString()
	{
		return "Invalid Age"+age;
	}
	
}

public class DemoAgeException {

	
	static void checkAge(int age) throws AgeException
	{
		if(age<18 && age>65)
		{
			throw new AgeException(age);
		}
		else 
		{
			System.out.println("Name and Age is Accepted");
		}
	}
	public static void main(String[] args) {

		int age=Integer.parseInt(args[0]);
		System.out.println(age);
		
		try
		{
			checkAge(age);
		}
		catch(AgeException ex)
		{
			System.out.println(ex);
		}
	}

}
