package com.threads;

public class PrintTable {

	public synchronized void  printTable(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
			
			try
			{
				Thread.sleep(2000);
				
			}
			catch(InterruptedException ex)
			{
				
			}
		}
	}

}
