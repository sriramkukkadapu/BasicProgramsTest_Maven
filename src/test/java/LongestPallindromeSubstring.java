

public class LongestPallindromeSubstring {
public static void main(String args[])
{
	String s="aabracecarcce";
	//System.out.println("Pallindrome : "+isPallindrome(s));
	int len=2;
	int i=0,j=0;
	int start,end;
	String longestPallindrome=null;
	
	for(len=2;len<s.length()+1;len++)
	{
		System.out.println("Length: "+len);
		
		for(start=0;start<s.length()+1&&(start+len)<s.length()+1;start++)
		{
			end=start+len;
			if(isPallindrome(s.substring(start,end))){
				System.out.println(s.substring(start,end)+" -pallindrome");
				longestPallindrome=s.substring(start,end);
			}
			else
				System.out.println(s.substring(start,end));
		}
	}
	
	System.out.println("----------------\nLongest pallindrome : "+longestPallindrome);
}

public static boolean isPallindrome(String s)
{
	boolean pallindrome=false;
	
	String reverse=(new StringBuffer(s)).reverse().toString();
	pallindrome=s.equals(reverse);
	
	return pallindrome; 
}
}
