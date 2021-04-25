
import java.util.ArrayList;
import java.util.Collections;


public class SortArrayEvenOdd {
public static void main(String args[])
{
	//input
	//12 67 1 34 9 78 6 31
	//output
	//6 12 34 78 67 31 9 1 
	
	//take 2 separate lists even and odd. sort separately and add list 2 to list1.
	//so final result is list1 thats it
	
	int[] input={12,67,1,34,9,78,6,31};
	ArrayList<Integer> evenList=new ArrayList<Integer>();
	ArrayList<Integer> oddList=new ArrayList<Integer>();
	
	
	System.out.print("I/P is :");
	for(int i=0;i<input.length;i++)
		System.out.print(input[i]+" ");
	
	for(int i=0;i<input.length;i++)
	{
		if(input[i]%2==0)
			evenList.add(input[i]);
		else
			oddList.add(input[i]);
	}
	
	//now sort both the list separately
	Collections.sort(evenList);
	Collections.sort(oddList);
	
	//append old list to even list
	evenList.addAll(oddList);
	
	//input=evenList.toArray();
	//input=evenList.toArray(new Integer[evenList.size()]);
	//In Java 8
	//int [] ints = evenList.stream().mapToInt(Integer::intValue).toArray();
	//Object[] objects=evenList.toArray();
	
	Integer[] output=evenList.toArray(new Integer[evenList.size()]);
	
	System.out.print("\nO/P is :");
	//print and store parlelley in input.
	for(int i=0;i<input.length;i++)
	{
		input[i]=Integer.valueOf(output[i]);
		System.out.print(input[i]+" ");
	}
	
	
}
}
