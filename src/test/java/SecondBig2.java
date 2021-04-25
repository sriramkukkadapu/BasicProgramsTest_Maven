

public class SecondBig2 {
public static void main(String args[])
{
	int a[]={1,25,56,-25,98,65,-98};
	//int a[]={1,25,56,255,999,1898,8999};
	int len=7;
	int big,secondbig;
	big=secondbig=Integer.MIN_VALUE;
	
	for(int i=0;i<len;i++)
	{
		if(a[i]>big)
		{
			secondbig=big;
			big=a[i];
		}
		else if(a[i] > secondbig)
			secondbig=a[i];
			
	}
	
	for(int i=0;i<len;i++)
	System.out.print(a[i]+ " ");
	
	System.out.println("\nBig : "+big);
	System.out.println("Second big : "+secondbig);
}
}
