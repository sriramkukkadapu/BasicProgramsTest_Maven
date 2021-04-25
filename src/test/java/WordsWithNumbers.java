
import java.util.StringTokenizer;


public class WordsWithNumbers {
public static void main(String args[])
{
	String input="a12 followed x3y1z but cb4a is not 16mn5";
	//print words that has numbers and find sum f all numbers in all words.
	String s=null;
	int totalSum=0;
	
	StringTokenizer st=new StringTokenizer(input," ");
	
	System.out.println("Given input : "+input);
	System.out.println("Words with Numbers are : ");
	
	while(st.hasMoreTokens())
	{
		s=st.nextToken();
		boolean wordhasNumbers=false;
		
		for(int i=0;i<s.length();i++)
		{
			int asciivalue=s.charAt(i);
			//ascii 48-57 are 0-9
			if(asciivalue>=48 && asciivalue<=57)
			{
				wordhasNumbers=true;
				totalSum+=Integer.parseInt(""+s.charAt(i));
			}
		}
		if(wordhasNumbers==true)
			System.out.print(s+" ");
	}
	
	System.out.println("\nSum of all numbers : "+totalSum);
		
}
}
