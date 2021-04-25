
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 This series
 
  1
  24
  135
  2468
  13579
 
 */
public class NumberSeries1 {
public static void main(String args[]) throws NumberFormatException, IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	System.out.println("Ener number of rows");
	int n=Integer.parseInt(br.readLine());
	
	int i,j,firstNo=0;
	for(i=1;i<=n;i++)
	{
		if(i%2==1)
			firstNo=1;
		else
			firstNo=2;
		
		for(j=1;j<=i;j++)
		{
			System.out.print(firstNo+" ");
			firstNo=firstNo+2;
		}
		
		System.out.println("");
	}
	
}
}
