package com.threads;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		A t1=new A();
		B t2=new B();
		C t3=new C();
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		Thread thread3=new Thread (t3);
		
		thread1.setPriority(2);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(7);
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Main Thread Completed");

	}

}
