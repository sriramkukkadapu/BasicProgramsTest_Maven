

public class String_eparateNumbersAndChars {
public static void main(String args[])
{
	String s="abc1234s2g2m89p";
	String chars="";
	String numbers="";
	char ch;
	
	for(int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		if(Character.isAlphabetic(ch))
			chars=chars+ch;
		else if(Character.isDigit(ch))
			numbers=numbers+ch;
	}
	
	System.out.println("Characters");
	System.out.println(chars);
	System.out.println("Numbers");
	System.out.println(numbers);
}
}

