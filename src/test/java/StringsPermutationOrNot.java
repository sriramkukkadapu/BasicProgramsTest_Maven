

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringsPermutationOrNot {
public static void main(String args[])
{
	String s1="abcdef";
	String s2="abdcfee";
	
	//Method 1
	
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	String s3,s4;
	s3=new String(ch1);
	s4=new String(ch2);
	
	if(s3.equals(s4))
		System.out.println(true);
	else
		System.out.println(false);
	
	//Method 2
	Map<Character,Integer> map1=stringToMap_CharCount(s1);
	Map<Character,Integer> map2=stringToMap_CharCount(s2);
	
	boolean equal=true;
	
	Set keys=map1.keySet();
	Iterator itr=keys.iterator();
	while(itr.hasNext())
	{
		char ch;
		ch=itr.next().toString().charAt(0);
		int count1=map1.get(ch);
		int count2=map2.get(ch);
		if(count1==count2)
			continue;
		else
			{ equal=false; break; }
	}
	
	if(equal==true && s1.length()==s2.length()) System.out.println(true);
	else System.out.println(false);
}

public static HashMap stringToMap_CharCount(String s)
{
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	char ch;
	
	for(int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		if(map.containsKey(ch))
		{
			int count=map.get(ch);
			map.put(ch, count+1);
		}
		else
			map.put(ch, 1);
	}
	
	return map;
}
}
