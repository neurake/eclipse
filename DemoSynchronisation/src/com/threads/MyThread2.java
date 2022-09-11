package com.threads;

public class MyThread2 extends Thread {

	PrintTable pt;

	public MyThread2(PrintTable pt) {
		super();
		this.pt = pt;
	}
	public void run()
	{
		pt.printTable(9);
	}
}
