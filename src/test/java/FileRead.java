

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
public static void main(String args[]) throws IOException
{
	FileInputStream fis=new FileInputStream("TestCSV.csv");
	String data="";
	int b;
	while((b=fis.read())!=-1)
	{
		//data=data+(char)fis.read();
		System.out.print((char)b);
	}
	
}
}
