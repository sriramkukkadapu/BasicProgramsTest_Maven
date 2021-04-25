

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SumPairArrayUsingMap {
public static void main(String args[])
{
	int a[]={1,2,-1,9,0,3,5,4};
	Map map;
	int sum=5,t=0;
	map=new HashMap<Integer,Boolean>();
	
	System.out.print("Given Array: ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	System.out.println("\n\nFinding Pairs for Sum="+sum+"\n");
	
	for(int i=0;i<a.length;i++)
	{
		t=sum-a[i];
		if(map.containsKey(t))
			System.out.println("Pair found: "+a[i]+","+t);
		else
			map.put(a[i],false);
	}
}
}
