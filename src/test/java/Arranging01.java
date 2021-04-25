

public class Arranging01 {
public static void main(String args[])
{
	int i,j,n,temp;
	int a[]={0,1,0,1,0,1,1,1,0,0,1}; //output should be 0001111
	n=a.length;
	
	System.out.print("Given Input: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]);
	
	//bubble sort
	/*
	for(i=n;i>1;i--) //no of passes
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println("Result:");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]); */
	
	//method2 - http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
	
	
	 int left = 0, right = n-1;
	 int pass=1;
	 
	    while (left < right)
	    {
	    	System.out.print("\nPass"+pass+": "); 
	        /* Increment left index while we see 0 at left */
	        while (a[left] == 0)
	            left++;
	 
	        /* Decrement right index while we see 1 at right */
	        while (a[right] == 1)
	            right--;
	 
	        /* If left is smaller than right then there is a 1 at left
	          and a 0 at right.  Exchange a[left] and a[right]*/
	        if (left < right)
	        {
	            a[left] = 0;
	            a[right] = 1;
	            left++;
	            right--;
	        }
	        
	        for(i=0;i<a.length;i++)
				System.out.print(a[i]);
	        pass++;
	    }
	    
	    System.out.println("\nResult:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
	
}
}
