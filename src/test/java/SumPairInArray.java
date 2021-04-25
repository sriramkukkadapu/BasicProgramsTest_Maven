

import java.util.Scanner;

public class SumPairInArray {
public static void main(String args[])
{
	int a[]={1,2,-1,9,0,3,5,4};
	int i,j,target=0;
	
	System.out.print("Enter sum to find pairs: ");
	Scanner scanner=new Scanner(System.in);
	target=scanner.nextInt();
	
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			if(a[i]+a[j]==target)
			{
				System.out.println("Found pair: "+a[i]+","+a[j]);
			}
		}
	}
}
}
