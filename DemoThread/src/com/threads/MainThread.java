package com.threads;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Main Thread Started.");
		A thread1=new A();
		B thread2=new B();
		C thread3=new C();
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Main thread Completed.");

	}

}
