

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IrreducibleFractions_IntegraConnect {
public static void main(String args[])
{
	//System.out.println(findFraction(32, 33));
	//System.out.println(findFraction(2, 4));
	
	 int n=8;
	
	int i,j;
	
	
	Set<String> fractions=new LinkedHashSet<String>();
	
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i<j)
			{
			String t=findFraction(i,j);
			
			//System.out.print(i+"/"+j+" ");
			if(i%j !=0 )
			//fractions.add(i+"/"+j);
			  fractions.add(t);
			}
		}
	}
	
	System.out.println("Irreducible Fractions are: ");
	Iterator itr=fractions.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}

public static String findFraction(int a,int b)
{
	String r=a+"/"+b;	
	int target;
	if(a>b) target=a; else target=b;
	int i;
	
	for(i=1;i<=target;i++)
	{
		if(a%i==0 && b%i==0)
		{
			//System.out.println("Factor found: "+i);
			//System.out.println(a+"/"+b);
			a=a/i;
			b=b/i;
			i=1;
		}
	}
	r=a+"/"+b;
	return r;
}
}
