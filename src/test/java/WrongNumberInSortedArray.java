

public class WrongNumberInSortedArray {
public static void main(String args[])
{
	//loop from 1st to last check where diff b/w current and prev ele is not 1, thats wrong element
	int a[]={2,3,4,5};
	int wrong=-1;
	int i;
	
	System.out.print("Given Input: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	for(i=1;i<a.length;i++)
	{
		if(a[i]-a[i-1]==1)
			continue;
		else
		{
			wrong=a[i];
			break;
		}
	}
	
	if(wrong==-1)
		System.out.println("\nArray is correct");
	else
	{
		System.out.println("\nWrong Element: "+wrong);
		System.out.println("Found at Posn: "+(i+1));
	}
	
	
	
	/*
	//one value not correct in a sorted array
	//{2,6,4,5} 
	//here in correct value is 6 which came in place of correct value 3
	//lets find how much actual sum this array should be
	//first find sum of (1-12) and then subtract sum(1-4) bec array started from number 2
	int a[]={2,7,4,5};
	int expectedSum=0;
	int currentSum=0;
	int n=a.length-1;
	
	expectedSum=sumOf1ToN(a[n])-(sumOf1ToN(a[n])-sumOfN1ToN2(a[0],a[n]));
	System.out.print("Given Input: ");
	for(int i=0;i<=n;i++)
		System.out.print(a[i]);
	
	System.out.print("\nExpected Sum: "+expectedSum);
	
	//Find currentSum
	for(int i=0;i<=n;i++)
		currentSum=currentSum+a[i];
	
	System.out.print("\nCurrent Sum: "+currentSum);
	
	int correctNum=0;
	
	//case1: when wrong number is > actual correct number
	//case1: when wrong number is < actual correct number
	
	//case1
	if(expectedSum<currentSum) // when wrong number is > actual correct number
	correctNum=currentSum-expectedSum;
	
	System.out.print("Correct Number: "+correctNum);
	
	*/
}
public static int sumOf1ToN(int n)
{
	int sum=0;
	sum=(n*(n+1))/2;
	return sum;
}
public static int sumOfN1ToN2(int n1,int n2)
{
	int sum=0;
	for(int i=n1;i<=n2;i++)
		sum=sum+i;
	return sum;
}
}
