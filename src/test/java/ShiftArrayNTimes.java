

public class ShiftArrayNTimes {
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5};
		//will do left shift
		int n=a.length-1;
		int firstEle;
		int shifts=5;
		
		System.out.print("Shift 0: ");
		for(int k=0;k<=n;k++)
			System.out.print(a[k]+" ");
		
		for(int s=1;s<=shifts;s++)
		{
				firstEle=a[0];
				for(int i=0;i<=n;i++)
			{
				if(i!=n)
				{
			//	movedInt=a[i+1];
				a[i]=a[i+1];
				}
				else
				{
					//last elem moving
					a[i]=firstEle;
				}

			}
				System.out.print("\nShift "+s+": ");
				for(int k=0;k<=n;k++)
					System.out.print(a[k]+" ");
		}

}
}
