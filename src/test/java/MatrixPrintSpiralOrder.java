

public class MatrixPrintSpiralOrder {
public static void main(String args[])
{
	int a[][]={
			{2,4,6,8},
			{5,9,12,16},
			{2,11,5,9},
			{3,2,1,8}
	};
	
	int m=4,n=4;
	int T=0,B=m-1,L=0,R=n-1;
	int dir=0,i;
	
	while(T<=B && L<=R)
	{
		if(dir==0)
		{
			for(i=L;i<=R;i++)
				System.out.print(a[T][i]+" ");
			
			System.out.println("");
			dir=1; // now bottom dir
			T++;
		}
		else if(dir==1)
		{
			for(i=T;i<=B;i++)
				System.out.print(a[i][R]+" ");
			
			System.out.println("");
			dir=2;
			R--;
		}
		else if(dir==2)
		{
			for(i=R;i>=L;i--)
				System.out.print(a[B][i]+" ");
				
			System.out.println("");
			dir=3;
			B--;
		}
		else if(dir==3)
		{
			for(i=B;i>=T;i--)
				System.out.print(a[i][L]+" ");
			
			System.out.println("");
			
			dir=0;
			L++;
		}
	}
}
}
