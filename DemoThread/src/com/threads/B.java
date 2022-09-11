package com.threads;

public class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B Started.");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread B:"+i);
		}
		System.out.println("Thread B Completed.");
	}

}
