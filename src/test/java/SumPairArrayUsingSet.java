

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SumPairArrayUsingSet {
public static void main(String args[])
{
	int a[]={1,2,-1,9,0,3,5,4};
	Set set;
	int sum=3,t=0;
	set=new HashSet(Arrays.asList(a));
	set=Arrays.stream(a).boxed().collect(Collectors.toSet());
	//System.out.println(set);
	Iterator itr=set.iterator();
	//while(itr.hasNext()) System.out.print(itr.next().toString());
	
	System.out.print("Given Array: ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	System.out.println("\n\nFinding Pairs for Sum="+sum+"\n");
	
	for(int i=0;i<a.length;i++)
	{
		t=sum-a[i];
		if(set.contains(t))
			System.out.println("Pair found: "+a[i]+","+t);
		//else
			//set.add(t);
	}
}
}
