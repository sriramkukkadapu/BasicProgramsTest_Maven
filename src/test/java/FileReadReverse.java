

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.input.ReversedLinesFileReader;


public class FileReadReverse {
public static void main(String args[]) throws IOException
{
	String strpath= System.getProperty("user.dir") +"/TestData.txt";
	@SuppressWarnings("deprecation")
	ReversedLinesFileReader fr = new ReversedLinesFileReader(new File(strpath));
	String ch;
	int count=0;
	String Conversion="";
	do {
	    ch = fr.readLine();
	    count++;
	    System.out.print(ch+"\n"); 
	} while (ch != null && count<=9);
	fr.close();
}
}
