

import java.util.Scanner;

public class ReadMultipleLines_Scanner {
public static void main(String args[])
{
	String data="";
	
	Scanner scanner=new Scanner(System.in);
	
	while(scanner.hasNextLine())
	{
		String line=scanner.nextLine();
		if(line.isEmpty()) break;
		data=data+"\n"+line;
	}
	
	

	
	System.out.println("Given data: "+data);
}
}
