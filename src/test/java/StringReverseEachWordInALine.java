
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class StringReverseEachWordInALine {
public static void main(String args[]) throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	System.out.print("Enter a line: ");
	String input=br.readLine();
	
	StringTokenizer st=new StringTokenizer(input," ");
	String reversedLine="";
	while(st.hasMoreTokens())
	{
		
		reversedLine=reversedLine+getReverse(st.nextToken());
		reversedLine=reversedLine+" ";
	}
	
	System.out.println("Result:");
	System.out.println(reversedLine);
}
public static String getReverse(String s)
{
	String reverse="";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	return reverse;
}
}
