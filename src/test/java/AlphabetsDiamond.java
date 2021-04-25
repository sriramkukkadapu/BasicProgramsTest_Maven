
/*
 
  A
 ABA
ABCBA
 ABA
  A
             
 */
public class AlphabetsDiamond {
public static void main(String args[])
{
	int n=5, a=65;
	int i,j,k;
	char c='A';
	
	for(i=1;i<=n;i++)
	{
		for(k=n-1;k>=i;k--)
			System.out.print(" ");
			
		c='A';
		for(j=1;j<=i;j++)
		{
			System.out.print(c);
			c++; // or (char)(c+1)
			
		}
		c--;
		
		for(j=i-1;j>=1;j--)
		{
			c--;
			System.out.print(c);
			
		}
		System.out.println("");
	}
}
}
