

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




class Anagarams
{
	public List<String> getAnagrams(char[] input)
	{
		List<String> result=new ArrayList<String>();
		
		//Lets 1st prepare map of char, count - TreeMap
		Map<Character,Integer> countMap=new TreeMap<Character,Integer>();
		
		for(char ch:input)
		{
			if(countMap.containsKey(ch))//if char is there 
			{
				//then update count ++
				int tempCount=countMap.get(ch);
				tempCount++;
				countMap.put(ch, tempCount);
			}
			else //if char is not der then add => A,1
			{
				countMap.put(ch, 1);
			}
		}
		//after the above look we expect countMap is = ABC
		//								 			   111
		
		//Now we have both chars and count in map , chars sorted bec it is a tree map so now 
		//we divide these into 2 separate arrays 1 with chars and another with count
		
		char[] str=new char[countMap.size()];
		int[] count=new int[countMap.size()];
		
		Set entrySet=countMap.entrySet();
		Iterator itr=entrySet.iterator();
		int index=0;
		while(itr.hasNext())
		{
			Map.Entry mEntry=(Map.Entry) itr.next();
			str[index]=mEntry.getKey().toString().charAt(0);
			count[index]=Integer.parseInt(mEntry.getValue().toString());
			index++;
		}
		
		//now we have characters, count in 2 separate arrays str and count
		
		System.out.println("countMap => "+countMap);
		System.out.println("str => "+new String(str));
		System.out.print("count => ");
		for(int ele:count) System.out.print(ele);
		
		//call permute function
		List resultList=new ArrayList<String>();
		char[] resultStr=new char[input.length];
		
		permute(str,count,0,resultStr,resultList);
		
		return resultList;
	}
	public void permute(char[] str, int[] count,int level,char[] result, List<String> resultList)
	{
		//1st check if count is 000 means we used all chars then add current result in resultList
		//if we reached to the level 3[size of input] then add result in resultList
		if(level==result.length)
		{
			resultList.add(new String(result));
			return; // to the previous level to swap the right elements again
		}
		
		// check from left to right in count array and stop when you reach > 0
		for(int i=0;i<str.length;i++)
		{
			if(count[i]==0) continue;
			else
			{
				//put the str char in the same depth(level) pos in result array
				result[level]=str[i];
				//we have used the count of the char so decrement it
				count[i]--;
				//go to the next depth(level)
				 permute(str, count, level + 1, result, resultList);
				//restore count to back where we left
				 count[i]++;
			}
		}
	}
}

public class AnagaramsTishar_MyTry
{
public static void main(String args[])
{
	Anagarams a=new Anagarams();
	System.out.println("\n"+a.getAnagrams("AABC".toCharArray()));
}
}
