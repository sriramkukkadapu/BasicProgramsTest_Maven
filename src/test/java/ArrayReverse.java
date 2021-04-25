

public class ArrayReverse {
public static void main(String args[])
{
	int a[]={1,2,3,4,5,6,7,8,0};
	int n=a.length;
	int mid=n/2;
	
	for(int i=0,j=n-1;i<mid;i++,j--)
	{
		//swap
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
}
}
