

public class SumOfNumbersInAStringArray {
public static void main(String args[])
{
	//Ex:1ABC34D768 the output shd be (1+34+768)
	
	String s="1ABC34D768";
	
	//we should keep forming numbers and then add it to total sum
	
	int sum=0;
	String numStr="";
	int i,j=0;
	
	System.out.println("Given String: "+s);
	
	for(i=0;i<s.length();i++)
	{
		//once a digit is found go and all other digits until u find another char.
		if(Character.isDigit(s.charAt(i)))
		{
			j=i;
			while( i<s.length() && Character.isDigit(s.charAt(j)))
			{
				//System.out.println("Current numStr: "+numStr+" i "+i+" j "+j);
				//System.out.println("Found Number: "+numStr);
				numStr=numStr+s.charAt(j);
				j++; i++;
			}
			System.out.println("Found Number: "+numStr);
			sum=sum+Integer.parseInt(numStr);
			
			numStr="";
		}
		
		
		/* if(Character.isDigit(s.charAt(i)))
			numStr=numStr+s.charAt(i); //just keep accumulating the digits
		
		if(numStr!="" && Character.isDigit(s.charAt(i))) // we can add current number to sum
		{
			System.out.println("Found Number: "+numStr);
			sum=sum+Integer.parseInt(numStr);
			
			numStr="";
		}*/
	}
	
	System.out.println("\nTotal Sum: "+sum);
}
}
