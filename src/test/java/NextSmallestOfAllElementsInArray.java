

import java.util.Scanner;

public class NextSmallestOfAllElementsInArray {
public static void main(String args[])
{
	//int a[]={23,2,9,17,35,26,-1,75};
	int a[]={8,2,4,5,1,6,0,3,2};
	int s[]=new int[a.length];
	//System.out.println("Enter a number: ");
	//Scanner scanner=new Scanner(System.in);
	
	
	int ns=-2147483648,i,j=0,k,t;
	
	System.out.println("Given Array: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	System.out.println("");
	
	for(k=0;k<a.length;k++)
	{
		t=a[k];
		ns=-2147483648;
		for(i=0;i<a.length;i++)
		{
	
			if(a[i]<t)
			{
				if(a[i]>ns)
				{
					ns=a[i];
				}
			}
		}
		if(ns!=-2147483648)
		s[j]=ns; 
		else
		s[j]=a[k];
		
		j++;
	}
	
	System.out.println("\nNext smallest for all numbers: ");
	for(i=0;i<s.length;i++)
		System.out.print(s[i]+" ");
}
}
