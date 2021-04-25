

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Denominations {
public static void main(String args[])
{
	int amount=6666;
	int given_amount=amount;
	int prevCount=0;
	
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	map.put(2000, 0);
	map.put(500, 0);
	map.put(100, 0);
	map.put(50, 0);
	map.put(20, 0);
	map.put(10, 0);
	map.put(5, 0);
	map.put(2, 0);
	map.put(1, 0);
	
	while(amount>0)
	{
		if(amount>=2000)
		{
			prevCount=map.get(2000);
			map.put(2000, prevCount+1);
			amount=amount-2000;
		}
		else if(amount>=500)
		{
			prevCount=map.get(500);
			map.put(500, prevCount+1);
			amount=amount-500;
		}
		else if(amount>=100)
		{
			prevCount=map.get(100);
			map.put(100, prevCount+1);
			amount=amount-100;
		}
		else if(amount>=50)
		{
			prevCount=map.get(50);
			map.put(50, prevCount+1);
			amount=amount-50;
		}
		else if(amount>=20)
		{
			prevCount=map.get(20);
			map.put(20, prevCount+1);
			amount=amount-20;
		}
		else if(amount>=10)
		{
			prevCount=map.get(10);
			map.put(10, prevCount+1);
			amount=amount-10;
		}
		else if(amount>=5)
		{
			prevCount=map.get(5);
			map.put(5, prevCount+1);
			amount=amount-5;
		}
		else if(amount>=2)
		{
			prevCount=map.get(2);
			map.put(2, prevCount+1);
			amount=amount-2;
		}
		else if(amount>=1)
		{
			prevCount=map.get(1);
			map.put(1, prevCount+1);
			amount=amount-1;
		}
	}
	
	TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>(map);
	Map sortedMap=treeMap.descendingMap();
	Set set=sortedMap.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry<Integer, Integer> mEntry=(Map.Entry<Integer, Integer>)(itr.next());
		if(mEntry.getValue()>0)
		{
			System.out.println(mEntry.getValue()+"*"+mEntry.getKey());
		}
	}
}
}

class MyComparator implements Comparator
{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int r=o2.toString().compareTo(o1.toString());
		return r;
	}
	
}
