

public class OccurenceOfFirst1 {
public static void main(String args[])
{
	int[] a={0,0,0,0,0};
	
	//binary search
		int i,end,mid,start;
		start=0;
		end=a.length-1;
		int resultPos=-1;
		boolean found=false;
		int pass=0;
		
		while(start<=end)
		{
			mid=(int) Math.floor((start+end)/2);
			
			/*pass++;
			if(pass==10)break;
			System.out.println("=====");
			System.out.println("Pass : "+pass);
			System.out.println("start : "+start);
			System.out.println("end : "+end);
			System.out.println("mid : "+mid);
			System.out.println("resultPos : "+resultPos);*/
			
			
			//if((a[mid]==1 && a[mid-1]==0) || (a[mid]==1 && mid==0))
			if(a[mid]==1&& mid==0)// comes in case of [1,1,1,1,1] all ones
			{
				found=true;
				resultPos=mid;
				break;
				//dont break consider the array now as 0 to mid-1 = we are searching if 1 is der in any of the left elements
				//if not present resultPos is already mid so no problem
				//start=0;
				//end=mid-1;// go left
			}
			
			else if(a[mid]==1 && a[mid-1]==0) // if comparision comes like {0,1} if a[mid] is 1 and before that we have 0 means stop
			{
				
				found=true;
				resultPos=mid;
				break;
				//dont break consider the array now as 0 to mid-1 = we are searching if 1 is der in any of the left elements
				//if not present resultPos is already mid so no problem
				//start=0;
				//end=mid-1;// go left
			}
			else if(a[mid]==1 && a[mid-1]!=0) //means we got something like {0,1,1,1} somewhere before mid one more 1 is der so need to catch it
			{
				end=mid;
				resultPos=mid;
			}
			else if(a[mid]!=1)//go right to find 1
			{
				start=mid+1;
			}

	
		}
		
		System.out.print("Input : ");
		for(int k=0;k<a.length;k++) System.out.print(a[k]);
		
		if(found==false)
			System.out.println("not found");
		else
		System.out.println("\nFound at position : "+(resultPos));
	
}
}
