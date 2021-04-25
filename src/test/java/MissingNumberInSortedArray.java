

public class MissingNumberInSortedArray {
public static void main(String args[])
{
	//we can do using formula
	//n(n+1)/2 gives actual sum, so subtract current sum of array from this we will get it
	
	int a[]={1,2,3,5,6,7,8};
	int actualSum=0;
	int currentArraySum=0;
	int missingNumber=0;
	
	//find arrays current sum
	for(int i=0;i<a.length;i++)
		currentArraySum=currentArraySum+a[i];
	
	//actual array sum use formula
	int n=a.length+1; //length returned would be 7 less than 1(missing ele) so adding it length would be 8
	actualSum=(n*(n+1))/2;
	
	//missing number is actualSum - currentSum
	missingNumber=actualSum-currentArraySum;
	
	System.out.print("Given Input: ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println("\nMissing Number : "+missingNumber);
}
}
