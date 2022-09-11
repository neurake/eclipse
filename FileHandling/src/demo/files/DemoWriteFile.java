package demo.files;

import java.io.*;

public class DemoWriteFile {

	public static void main(String[] args) {
		
		try
		{
					FileWriter fw=new FileWriter("D://myFile.php");
					fw.write("This is my first file from java");
					System.out.println("Data Written Successfully");
					fw.close();
		}
		catch(IOException ex)
		{
				System.out.println(ex);
		}
	}

}
