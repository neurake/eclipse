package com.demo.practice;
 class InvalidCountryException extends Exception
{
	String country;
	InvalidCountryException(String country)
	{
		this.country=country;
	}
	public String toString()
	{
		return "User outside India cannot be registered.";
	}
}

public class UserRegistration {
	
	static void checkCountry(String country)throws InvalidCountryException
	{
		if(!country.equalsIgnoreCase("India"))
		{
			throw new InvalidCountryException(country);
		}
		else
		{
			System.out.println("User registration done successfully.");
		}
	}

	public static void main(String[] args) {
		
		String username=args[0];
		String userCountry=args[1];
		try
		{
			checkCountry(userCountry);
			
		}
		catch(InvalidCountryException ex)
		{
			System.out.println(ex);
			
		}
	
	}

}
