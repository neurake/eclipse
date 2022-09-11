package com.threads;

public class B implements Runnable
{

	@Override  //annotations =tags   starts with@ predefined
	public void run() {
		System.out.println("Thread B Started");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread B:"+i);
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread B Completed");
		
	}
}
