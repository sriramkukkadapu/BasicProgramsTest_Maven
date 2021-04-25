

public class Arranging01_2 {
public static void main(String args[])
{
	int i,j,n,temp,mismatch=0;
	int a[]={0,1,0,1,1,1,0,1,0,0,1,0}; //output should be 0001111
	n=a.length;
	
	System.out.print("Given Input: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]);
	
	System.out.println("");
	
	for(i=0;i<n-1;i++)
	{
		if(a[i]==1 && a[i+1]==0)
			//swap this 0 till u find a 0
		{
			
			j=i;
			while(a[j]!=0)
				j--;
			
			//j+1 would be a one so swap i and j
			
			swap(a,i+1,j+1);
		}
	}
	
	/*
	temp=0; mismatch=0;
	for(i=0;i<n-1;i++)
	{
	
		if(a[i]==1 && a[i+1]==0)
		{
			temp=i; mismatch=1;
			System.out.println("mismatch found at index: "+i+","+(i+1));
			
		}
		
		if(a[i]==0 && a[i+1]==1 && mismatch==1)
		{
			swap(a,temp,i);
			mismatch=0;
			temp=0;
		}
	

	} */
	
	
	    System.out.println("\nResult:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
	
}

public static void swap(int a[],int i,int j)
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
}
