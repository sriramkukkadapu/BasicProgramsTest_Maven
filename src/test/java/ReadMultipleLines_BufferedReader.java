

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadMultipleLines_BufferedReader {
public static void main(String args[]) throws IOException
{
	String data="";
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line;
	
	while((line=br.readLine())!=null)
	{
		if(line.isEmpty()) break;
		data=data+"\n"+line;
	}
	
	
	System.out.println("Given data: "+data);
	
}
}
