

public class SecondBig {
public static void main(String args[])
{
	//int a[]={1,25,56,-25,98,65,-98};
	int a[]={1,25,56,255,999,1898,8999};
	int len=7;
	int i,big,secondbig;
	
	big=a[0];
	secondbig=a[0];
	
	int bigindex=-1;
	//int secondbigindex=-1;
	
	for(i=0;i<len;i++)
	{
		if(a[i]>big && a[i]>secondbig)
			{
				//secondbig=big;
				//secondbigindex=bigindex;
				
				big=a[i];
				//bigindex=i;
			}
		else if(secondbig < a[i])
		{
			secondbig=a[i];
			//secondbigindex=i;
		}
	}
	
	for(i=0;i<len;i++)
	System.out.print(a[i]+ " ");
	
	System.out.println("\nBig : "+big);
	System.out.println("Second big : "+secondbig);
}
}
