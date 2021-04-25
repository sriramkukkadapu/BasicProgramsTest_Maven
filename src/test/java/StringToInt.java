

public class StringToInt {
public static void main(String args[])
{
	String s="-12345";
	boolean isNegative=false;
	int i=0;
	int sum=0;
	
	if(s.charAt(0)=='-')
	{ isNegative=true; i=1;
	}
	
	for(;i<s.length();i++)
	{
		int cur=s.charAt(i)-'0'; //ascii value
		System.out.println(cur);
		sum=sum*10+cur;
	}
	
	int n=sum;
	
	if(isNegative==true)
		n=-n;
	
	System.out.println(n);
}
}
