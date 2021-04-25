
import java.util.ArrayList;


public class ArraysCommonElements {
public static void main(String args[])
{
	int a1[]={5,6,4,8,9,0,3};
	int a2[]={7,1,2,6,0,3};
	
	int res[];
	
	res=findCommonElements(a1,a2);
	
	for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
}

public static int[] findCommonElements(int a1[], int a2[])
{
	int i;
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for(i=0;i<a1.length;i++)
	{
		if(findElementInArray(a1[i],a2))
			list.add(a1[i]);
	}
	
	//convert list to array
	
	int res[]=new int[list.size()];
	int resIndex=0;
	for(i=0;i<list.size();i++)
	{
		res[resIndex]=list.get(i);
		resIndex++;
	}
	
	return res;
}
public static boolean findElementInArray(int ele,int a[])
{
	
	for(int i=0;i<a.length;i++)
		if(a[i]==ele)
			return true;
	
	return false;
}
}
