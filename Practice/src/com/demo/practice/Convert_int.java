package com.demo.practice;

public class Convert_int {

	public static void main(String[] args) {


		int no=Integer.parseInt(args[0]);
		
	   System.out.println("given number ="+no);
	   System.out.println("binary "+Integer.toBinaryString(no));
	   System.out.println("Octal  "+Integer.toOctalString(no));
	   System.out.println("hexa    "+Integer.toHexString(no));
	   

	}

}
