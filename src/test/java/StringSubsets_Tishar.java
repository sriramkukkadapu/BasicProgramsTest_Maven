

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




class SubSets
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
		
		System.out.println("Given Input : "+new String(input));
		System.out.println("countMap => "+countMap);
		System.out.println("str => "+new String(str));
		System.out.print("count => ");
		for(int ele:count) System.out.print(ele);
		
		//call permute function
		List resultList=new ArrayList<String>();
		char[] output = new char[input.length];//output is a empty array of char
		
		combination(str,count,0,output,0,resultList);
		
		return resultList;
	}
	public void combination(char[] input, int[] count,int pos,char[] output,int level, List<String> resultList)
	{
		
		//first print the array output from pos to length = from i=pos to len add all chars and form a string add it to resultList
		addToResultList(resultList,output,level);

		//look for 1st available character from position[0] 
		for(int i=pos;i<input.length;i++)
		{
			if(count[i]==0)continue;
		
			else
			{
			//put char in depth of output array
			output[level]=input[i];
			//decrement count for this char bec we used it.
			count[i]--;
			//go to depth+1 of same function
			combination(input,count,i,output,level+1,resultList);
			//restore count
			count[i]++;
			}
		}
	}
	public void addToResultList(List<String> resultList,char[] output,int len)
	{
		String tempStr="";
		for(int i=0;i<len;i++)
			tempStr=tempStr+output[i];
		resultList.add(tempStr);
	}
}

public class StringSubsets_Tishar
{
public static void main(String args[])
{
	SubSets s=new SubSets();
	System.out.println("\n"+s.getAnagrams("ABC".toCharArray()));
}
}
