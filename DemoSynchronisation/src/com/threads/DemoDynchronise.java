package com.threads;

public class DemoDynchronise {

	public static void main(String[] args) {
		PrintTable pt=new  PrintTable();
		MyThread1 t1=new MyThread1(pt);
		MyThread2 t2=new MyThread2(pt);

		t1.start();
		t2.start();
		
	}

}
