

public class NextBigInArray {
public static void main(String args[])
{
	int a[]={3,4,20,6,15,2,1,7};
	//result should be {20,20,20,15,15,7,7,7}
	int result[]=new int[a.length];
	int i,j,big,n;
	n=a.length;
	
	print_array(a);
	
	for(i=0;i<n;i++)
	{
		big=a[i];
		result[i]=a[i];
		
		for(j=i+1;j<n;j++)
		{
			if(a[j]>big)
				big=a[j];
		}
		
		result[i]=big;
	}
	
	//print result array
	print_array(result);
}

public static void print_array(int a[])
{
	System.out.print("[");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+",");
	
	System.out.println("]");
}
}
