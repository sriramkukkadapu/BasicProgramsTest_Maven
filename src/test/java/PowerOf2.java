
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PowerOf2 {
public static void main(String args[]) throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number : ");
	int n=Integer.parseInt(br.readLine());
	boolean powerOf2=true;
	int rem=0;
	
	while(n!=2)
	{
		rem=n%2;
		System.out.println("rem:"+rem);
		if(rem!=0)
			{
			powerOf2=false;
			break;
			}
		n=n/2;
	}
	
	System.out.println("Power of 2 : "+powerOf2);
	
}
}
