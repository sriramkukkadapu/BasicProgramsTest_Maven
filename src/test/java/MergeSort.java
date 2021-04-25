

public class MergeSort {

	public static void main(String args[])
	{//https://www.youtube.com/watch?v=TzeBrDU-JaY
		int a[]={2,4,1,6,8,5,3,7,9};
		
		mergesort(a);
		
		System.out.print("After sorting: ");
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
	}
	
	public static void mergesort(int[] A)
	{
		int n=A.length;
		if(n<2) return;
		
		int mid=n/2,i,j;
		int[] l=new int[mid];
		int[] r=new int[n-mid];
		
		for(i=0;i<=mid-1;i++)
			l[i]=A[i];
		
		for(i=mid,j=0;i<n;i++,j++)
			r[j]=A[i];
		
		mergesort(l);
		mergesort(r);
		
		merge(l,r,A);
	}
	
	public static void merge(int[] l,int[] r,int[] A)
	{
		int nl=l.length,nr=r.length,i=0,j=0,k=0;
		while(i<nl && j<nr)
		{
			if(l[i]<=r[j])
			{
				A[k]=l[i];
				k++;
				i++;
			}
			else
			{
				A[k]=r[j];
				j++;
				k++;
			}
		}
		
		while(i<nl) 
		{
			A[k]=l[i];
			k++;
			i++;
		}
		while(j<nr)
		{
			A[k]=r[j];
			k++;
			j++;
		}
	}
}
