

public class NextBigInASortedArray {
public static void main(String args[])
{
	int a[]={2,3,5,7,9,25};
	int n=a.length;
	//binary search
	int target=25; //it should give next big means 9
	int mid,left=0,right=n;
	int found=0;
	mid=(left+right)/2;
	int i=1;
	
	while(true)
	{
		System.out.println("Iteration: "+i);
		System.out.println("Left: "+left+" Right "+right+" Mid "+mid);
		
		if(mid==0 || mid==n)
			{if(a[mid]==target) found=1;
			break;}
		
		else
		{
			if(a[mid]==target)
			{
				found=1;
				break;
			}
			
			if(a[mid]<target)//go rightside
				left=mid;
			else if(a[mid]>target)
				right=mid;
		}
			i++;
			mid=(left+right)/2;
	}
	
	if(found==1)
		System.out.println("Found "+a[mid]+" at index: "+mid);
	
	if(mid==n-1) //means this is last ele
		System.out.println("Given ele is the biggest one");
	else
		System.out.println("Next Biggest element is: "+a[mid+1]);
}
}
