

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NearSmallestArray_IntegraConnect2 {
public static void main(String args[]) throws NumberFormatException, IOException
{
	//int a[]={23,2,9,17,35,26,-1,75};
	//input taking 2 strings
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	int n=Integer.parseInt(br.readLine());
	String inputStr=br.readLine();
	int a[]=new int[n];
	int i,j=0;
	
	for(i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(inputStr.split(" ")[i]);
	}
	
	

	int s[]=new int[a.length];
	

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
	
	int ns=-1,e=a[curIndex];
	int i=curIndex-1,j=curIndex+1;
	

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
	
	
	if(lf==1 && rf==1) 
	{
		if(curIndex-i < j-curIndex) ns=a[i];
		else if(j-curIndex < curIndex-i) ns=a[j];
		else
			
			if(a[i]<a[j]) return a[i];
			else return a[j];
	}
	else if(lf==0 && rf==0) 
		return -1;
	else if(lf==0) ns=a[j];
	else if(rf==0) ns=a[i];
	
	
	return ns;
}
}
