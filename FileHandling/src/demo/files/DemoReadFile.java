package demo.files;

import java.io.*;
import java.util.Scanner;

public class DemoReadFile {

	public static void main(String[] args) {
		try
		{
			File f=new File("D://myFile.txt");
			System.out.println("FileSize:"+f.length());
		FileReader fr= new FileReader(f);
		Scanner sc=new Scanner(f);
		String s=sc.nextLine();
		System.out.println(s);
		
		
		fr.close();
		}
		catch(IOException ex)
		{
			
		}
		
		
		

	}

}
