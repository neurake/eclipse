package com.threads;

public class Table {
	
	synchronized public void printTable(int number)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*number);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("chal nikal");
			}
		}
	}

}
