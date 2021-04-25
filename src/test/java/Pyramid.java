
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pyramid {
public static void main(String a[]) throws NumberFormatException, IOException
{
int i,j,k,n;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter number of rows");
n=Integer.parseInt(br.readLine());

	for(i=1;i<=n;i++)
	{
		for(k=n;k>=i;k--)
			System.out.print(" ");
		for(j=1;j<=i;j++)
		{	System.out.print(i+" ");
		
		}
	
		System.out.println();
	}
}
}
