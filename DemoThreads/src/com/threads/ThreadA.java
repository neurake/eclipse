package com.threads;

public class ThreadA extends Thread {

	public void run()
	{
		System.out.println("Thread A Started");
		for(int i=1;i<=5;i++)
		{
			System.out.println("ThreadA "+i);
			try
			{
				//Thread.sleep(5000);
			}
			catch(Exception ex)
			{
				
			}
		}
		System.out.println("Thread A completed");
	}
}
