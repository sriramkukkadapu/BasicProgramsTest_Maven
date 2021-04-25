

import java.util.Scanner;

public class NearSmallestArray_IntegraConnect {
public static void main(String args[])
{
	//int a[]={23,2,9,17,35,26,-1,75};
	int a[]={8,2,4,5,1,6,0,3,2};
	int s[]=new int[a.length];
	int i,j=0;
	
	System.out.println("Given Array: ");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	
	for(i=0;i<a.length;i++)
	{
		int ns=findNearSmallest(a,i);
		s[j]=ns;
		j++;
	}
	
	System.out.println("\nSmallest Array: ");
	for(i=0;i<s.length;i++)
		System.out.print(s[i]+" ");

	}

public static int findNearSmallest(int a[],int curIndex)
{
	System.out.println("Pass "+curIndex+": ");
	int ns=-1,e=a[curIndex];
	int i=curIndex-1,j=curIndex+1;
	
	/* for(;i>=0&&j<a.length;i--,j++)
	{
		if(a[i]<e && curIndex-i<j-curIndex)
			{ ns=a[i]; break; }
		if(a[j]<e && j-curIndex<curIndex-i)
		{ ns=a[j]; break; }
	}*/
	int lf=0, rf=0;
	for(;i>0;i--)
	{
		if(a[i]<e)
		{
			lf=1;
			break;
		}
	}

	for(;j<a.length;j++)
	{
		if(a[j]<e) 
		{
			rf=1;
			break;
		}
	}
	
	System.out.println("Found Left: "+lf);
	System.out.println("Found Right: "+rf);
	
	if(lf==1 && rf==1) 
	{
		if(curIndex-i < j-curIndex) ns=a[i];
		else if(j-curIndex < curIndex-i) ns=a[j];
		else
			//if smallers found at same distance then return small number among them
			if(a[i]<a[j]) return a[i];
			else return a[j];
	}
	else if(lf==0 && rf==0) //no smaller ele found
		return -1;
	else if(lf==0) ns=a[j];
	else if(rf==0) ns=a[i];
	
	
	return ns;
}
}
