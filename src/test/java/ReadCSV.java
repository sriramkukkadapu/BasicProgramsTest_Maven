

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
public static void main(String args[]) throws IOException
{
	FileReader fr=new FileReader("TestCSV.csv");
	BufferedReader br=new BufferedReader(fr);
	String line=null;
	
	while((line=br.readLine())!=null) //repeat until the read line is null
	{
		System.out.println(line);
	}
}
}
