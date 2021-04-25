

public class OccurenceOfCharInAString {
public static void main(String a[])
{
	String s="Sriram";
	char find='R';
	int count=0;
	
	for(int i=0;i<s.length()-1;i++)
		if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(find))
			count++;
	
	System.out.println(count);
}
}
