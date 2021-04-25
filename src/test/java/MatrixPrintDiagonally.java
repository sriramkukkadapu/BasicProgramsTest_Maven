

public class MatrixPrintDiagonally {
public static void main(String args[])
{
	//number of diagonals formula m+n-1
	
	char a[][]={
			
			{'a','b','c','d','e'},
			{'f','g','h','i','j'},
			{'k','l','m','n','o'},
			{'p','q','r','s','t'}
	};
	
	//print row diagonals
	int i,j,k,m,n;
	m=4; n=5;
	
	for(k=0;k<=m-1;k++)
	{
		i=k;  //row
		j=0;  //column starting is this so it is fixed
		
		while(i>=0)
		{
			System.out.print(a[i][j]+" ");
			i=i-1;
			j=j+1;
		}
		System.out.println("");
	}
	
	for(k=1;k<=n-1;k++) //take from 1 because 1st diagonal already printed
	{
		i=m-1; //every diagonal starts from m-1
		j=k; 
		
		while(j<=n-1)
		{
			System.out.print(a[i][j]+" ");
			i=i-1;
			j=j+1;
		}
		System.out.println("");
	}
}
}
