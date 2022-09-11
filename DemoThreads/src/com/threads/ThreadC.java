package com.threads;

public class ThreadC  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread C started");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread c"+i);
		}
		System.out.println("thread c completed");
		
	}

	
}
