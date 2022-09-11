package com.threads;

public class ThreadB extends Thread {
	public void run()
	{
		System.out.println("Thread B is started");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread B "+i);
			if(i==2)
			{
				stop();
				}
		}
		System.out.println("Thread B completed");
	}

}
