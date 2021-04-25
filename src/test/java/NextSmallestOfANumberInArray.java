

import java.util.Scanner;

public class NextSmallestOfANumberInArray {
public static void main(String args[])
{
	int a[]={23,2,9,17,35,26,-1,75};
	
	System.out.println("Enter a number: ");
	Scanner scanner=new Scanner(System.in);
	int t=Integer.parseInt(scanner.next());
	
	int ns=-2147483648,i;
	
	for(i=0;i<a.length;i++)
	{
		if(a[i]<t)
		{
			if(a[i]>ns)
			{
				ns=a[i];
			}
		}
	}
	
	System.out.println("Next smallest: "+ns);
}
}
