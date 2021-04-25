

public class RepeatingIntegersAndCount {
	static int a[]={10,5,16,2,5,10,5};
	
	static int numbersArray[]=new int[5];
	static int countArray[]=new int[5];
	static int numbersLength=0;
	
public static void main(String args[])
{
	System.out.print("Given input : ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

	for(int i=0;i<a.length;i++)
	{
		//now we need to see how many times this current number is present in array
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(alreadyCounted(a[j])==true)
				continue;
			else
			{
				if(a[i]==a[j])
					count++;
			}
		}	
			//if count is > 1 means it is a duplicate add it to numbers array,count array and inc index
			if(count > 1)
			{
			numbersArray[numbersLength]=a[i];
			countArray[numbersLength]=count;
			numbersLength++;
			}
			else if(count==1)//present only once then add with count 1
			{
				//if count is 1 just add the number and count as 1
				numbersArray[numbersLength]=a[i];
				countArray[numbersLength]=1;
				numbersLength++;
			}
		
	}
	
	//so we have result in numbers array and count array

	
	System.out.println("\nDuplicates are : ");
	for(int i=0;i<numbersLength;i++)
		if(countArray[i]>1)
		System.out.print(numbersArray[i]+" ");
	
	System.out.println("");
	for(int i=0;i<numbersLength;i++)
		System.out.print(numbersArray[i]+"("+countArray[i]+") ");
	
}

public static boolean alreadyCounted(int n)
{
	boolean counted = false;
	
	for(int i=0;i<numbersLength;i++)
		if(numbersArray[i]==n)
			return true;
	
	return counted;
}

}
