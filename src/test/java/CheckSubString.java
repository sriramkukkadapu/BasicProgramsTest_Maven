
import java.util.StringTokenizer;


public class CheckSubString {
public static void main(String args[])
{
	 //program to check if a given "the" is present in a string s1 "This is the best time"
	
	String s="This is the best time";
	String target="the";
	int found=0;
	
	StringTokenizer st=new StringTokenizer(s," ");
	while(st.hasMoreTokens())
	{
		if(st.nextToken().equals(target))
		{
			found=1;
			break;
		}
	}
	if(found==1)
		System.out.println("Input String: "+s);
		System.out.println("String to be searched: "+target);
		System.out.println("Found");
	
}
}
