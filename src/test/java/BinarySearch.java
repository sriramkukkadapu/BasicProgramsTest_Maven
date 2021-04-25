

public class BinarySearch {
public static void main(String args[])
{
	int[] a={1,2,3,4,5,6,7,8,9};
	
	//binary search
	int i,end,mid,start;
	start=0;
	end=a.length;
	int target=7;
	boolean found=false;
	
	for(;end>=start;)
	{
		mid=(start+end)/2;
		if(a[mid]==target)
		{
			System.out.print("Input : ");
			for(int k=0;k<a.length;k++) System.out.print(a[k]);
			
			System.out.println("\nFound at position : "+(mid+1));
			found=true;
			break;
		}
		else if(target<a[mid]) //go to left side
			end=mid;
		else if(target > a[mid])// go to right
			start=mid;
	}
	if(found==false)
		System.out.println("not found");
	
	
}
}
