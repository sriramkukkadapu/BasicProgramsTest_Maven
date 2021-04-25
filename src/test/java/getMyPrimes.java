

public class getMyPrimes {
public static void main(String args[])
{
	System.out.println(getMyPrimes(4));
	
	//System.out.println(getNextPrime(5));
}

public static String getMyPrimes(int n)
{
	String result="";
	int previousPrime=1;
	int temp;
	
	int count=1;
	while(count<=n)
	{
		temp=getNextPrime(previousPrime);
		result+=temp+",";
		count++;
		previousPrime=temp;
	}
	
	return result;
}

public static int getNextPrime(int n)
{
	int i=0;
	boolean isPrime=false;
	n++;
	while(isPrime==false)
	{
		isPrime=true;
		
		for(i=2;i<n/2;i++)
			if(n%i==0)
				isPrime=false;
		
		if(isPrime==true)
			return n;
		else
			n++;
	}
	
	return n;
}
}
