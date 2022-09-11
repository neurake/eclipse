package com.threads;

public class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C started.");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread C:"+i);
		}
		System.out.println("Thread C completed.");
	}
}
