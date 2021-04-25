

public class BinaryToDecimal {
public static void main(String args[])
{
	int binary=10111101;
	int sum=0;
	int c=0;
	
	int n=binary;
	
	while(n!=0)
	{
		int rem=n%10;
		sum=(int) (sum+(rem*Math.pow(2, c)));
		c++;
		n=n/10;
	}
	
	System.out.println("Decimal="+sum);
	
}
}
