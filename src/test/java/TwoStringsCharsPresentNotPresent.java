

public class TwoStringsCharsPresentNotPresent {
public static void main(String args[])
{
	String s1="ABC",s2="BC";
	check_and_print(s1, s2);
	s1="BC"; s2="BANGALORE";
	System.out.println("-----------");
	check_and_print(s1, s2);
}

public static void check_and_print(String s1,String s2)
{
String o1="",o2="";
	
	//first print missing chars in B from A => o1
	
	System.out.println(s1+"  "+s2);
	
	int i,j;
	
	for(i=0;i<s1.length();i++)
	{
		int found=0;
		found=s2.indexOf(s1.charAt(i));
		if(found==-1)
			o1=o1+s1.charAt(i);		
	}
	
	for(i=0;i<s2.length();i++)
	{
		int found=0;
		found=s1.indexOf(s2.charAt(i));
		if(found==-1)
			o2=o2+s2.charAt(i);
	}
	
	if(o2=="") o2=null;
	
	System.out.println(o1+"  "+o2);
}
}
