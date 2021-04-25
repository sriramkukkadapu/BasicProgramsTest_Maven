

public class BubbleSort {
public static void main(String args[])
{
int a[]={35,7,23,21,2};

int n=a.length;
int i,j,temp,k;

for(i=n-1;i>0;i--)
{
	for(j=0;j<i;j++)
	{
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	//print each pass
	System.out.print("Pass "+(n-i)+" : ");
	for(k=0;k<n;k++)
		System.out.print(a[k]+" ");
	System.out.println("");
}

System.out.print("\nFinal Array : ");
for(i=0;i<n;i++)
	System.out.print(a[i]+" ");
}
}
