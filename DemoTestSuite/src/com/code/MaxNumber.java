package com.code;

public class MaxNumber {
	//method for finding max number form array
	public int findMax(int numbers[])
	{
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(max<numbers[i])
			{
				max=numbers[i];
			}
		}
		
		
		return max;
	}
	
	//method for finding min number from array
	public int findMin(int numbers[])
	{
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(min>numbers[i])
			{
				min=numbers[i];
			}
		}
		
		
		return min;
	}

}
