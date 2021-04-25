

public class InsertionSort {
public static void main(String args[])
{
	int a[]={7,2,4,1,5,3};
	int n=a.length;
	int hole;
	
	for(int i=1;i<n;i++)
	{
		int temp=a[i];
		hole=i;
		while(hole>0 && a[hole-1]>temp)
		{
			a[hole]=a[hole-1];
			hole=hole-1;
		}
		a[hole]=temp;
		
		printArray(a);
	}
	
}
public static void printArray(int a[])
{
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	System.out.println("");
}
}
