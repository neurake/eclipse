package com.threads;

public class A implements Runnable 
{

	@Override  //annotations =tags   starts with@ predefined
	public void run() {
		System.out.println("Thread A Started");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread A:"+i);
		}
		System.out.println("Thread A Completed");
		
	}

}
