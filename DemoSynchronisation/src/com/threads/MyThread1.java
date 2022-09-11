package com.threads;

public class MyThread1 extends Thread{

	PrintTable pt;

	public MyThread1(PrintTable pt) {
		super();
		this.pt = pt;
	}
	
	public void run()
	
	{
		pt.printTable(5);
	}
	
}
