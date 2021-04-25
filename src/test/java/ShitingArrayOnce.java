

public class ShitingArrayOnce {
public static void main(String args[])
{
	int[] a={1,2,3,4,5};
	//will do left shift
	int n=a.length-1;
	
	int firstEle=a[0];
	int movedInt;
	for(int i=0;i<=n;i++)
	{
		if(i!=n)
		{
	//	movedInt=a[i+1];
		a[i]=a[i+1];
		}
		else
		{
			//last elem moving
			a[i]=firstEle;
		}
	}
	for(int i=0;i<=n;i++)
	System.out.println(a[i]);
}
}
