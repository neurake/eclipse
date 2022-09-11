package com.threads;

public class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A started.");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread A:"+i);
		}
		System.out.println("Thread A Completed");
	}

}
