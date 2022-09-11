package rk;
public class ElseDemo
{
	public static void main(String[] args) 
	{
	 	int a=10,b=30,c=60;
	 	System.out.println("Largest Value is:");
	 	if(a>b)
	 	{
	 		if(a>c)
	 			System.out.println(a);
	 		else
	 			System.out.println(c);
	 	}
	 	else 
	 	{
	 		if(c>b)
	 			System.out.println(c);
	 		else
	 			System.out.println(b);
	 	}
	}
	
}
