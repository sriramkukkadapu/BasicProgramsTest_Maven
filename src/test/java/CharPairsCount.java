
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 Strestopathestic
 
 st - 3 times
 es - 2 times
 */

public class CharPairsCount {
public static void main(String args[])
{
	String s=  "stresstessedstresstd";
	int i,char1,char2,count=0,j,camebefore=0;
	
	Set<String> uniquePairs=new HashSet<String>();
	
	System.out.println("String length : "+s.length());
	
	for(i=0;i<s.length()-1;i++)
	{
	
		char1=s.charAt(i);
		char2=s.charAt(i+1);
		
		//System.out.println("Checking for : "+s.charAt(i)+s.charAt(i+1));
		//System.out.println("Current index : "+i+""+(i+1));
		count=0;
		camebefore=0;
		int exists=0;
				
		// check if this pair came before ?? if came not need to count now check in set
		String charPair=""+s.charAt(i)+s.charAt(i+1);
		//check if set already has this pair if it has dont check the count or else then check it
		Iterator<String> itr=uniquePairs.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(charPair))
				exists=1;
		}
		//if current char pair does not exists in set then do the count and insert this pair in set
		if(exists==0)
		{
			//put char pair in set 1st
			
			uniquePairs.add(charPair);
			
			for(j=0;j<s.length()-1;j++)
			{
				if(j!=i && j!=i+1)
				{
					if((s.charAt(i)==s.charAt(j))&&
							(s.charAt(i+1)==s.charAt(j+1)))
					{
						//System.out.println("Found at other place : "+j+""+(j+1));
						count++;
					}
				}
				
			}
			if(count >= 1)
			System.out.println(""+s.charAt(i)+s.charAt(i+1)+" "+(count+1));
		}
	}
}
}
