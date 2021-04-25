
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class PallindromePossibilityofaString {
	
	public static void main(String args[])
	{
	/*
	 * Input	Output
		mmo		true
		yakak	true
		travel	false
	 */
		String s="racecar";
		
		//valid possibilities
		//all even chars
		//1 odd char and rest all even chars
		
		//Invalid
		//more than 1 odd number of chars
		
		//identify char count
		
		Map<Character,Integer> mCharCount=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(mCharCount.containsKey(c))
			{
				int count=mCharCount.get(c);
				count++;
				mCharCount.put(c, count);
			}
			else
				mCharCount.put(c, 1);
		}
		
		System.out.println(mCharCount);
		
		int noofOddChars=0;
		int noofEvenChars=0;
		
		Set entrySet=mCharCount.entrySet();
		Iterator itr=entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Character,Integer> mEntry=(Entry<Character, Integer>) itr.next();
			if(mEntry.getValue()%2==0)
				noofEvenChars++;
			else
				noofOddChars++;
		}
		
		System.out.println("Number of Even chars : "+noofEvenChars);
		System.out.println("Number of Odd chars : "+noofOddChars);
		
		if(noofOddChars>1)
			System.out.println("false");
		else
			System.out.println("true");
		
		//simple method check index and last index of a char if it is same for more than 1 char which means 
		//there is more than 1 odd occurence char so we can break the loop.
	}

}
