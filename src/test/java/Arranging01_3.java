

public class Arranging01_3 {
public static void main(String args[])
{
	int i,j,n,temp,mismatch=0;
	int a[]={0,1,0,1,1,1,0,1,0,0}; //output should be 0001111
	n=a.length;
	
	System.out.print("Given Input: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]);
	
	System.out.println("");
	
	int b[]=new int[a.length];
	int b_l=0,b_r=a.length-1;
	
	for(i=0;i<a.length;i++){
		if(a[i]==0)
			{ b[b_l]=0; b_l++; }
		else if(a[i]==1)
		{ b[b_r]=1; b_r--; }
	}
	
	    System.out.println("\nResult:");
		for(i=0;i<b.length;i++)
			System.out.print(b[i]);
	
}

public static void swap(int a[],int i,int j)
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
}
