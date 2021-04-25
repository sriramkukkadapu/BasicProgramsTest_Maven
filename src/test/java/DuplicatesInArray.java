
import java.util.HashSet;
import java.util.Set;


public class DuplicatesInArray {
public static void main(String args[])
{
	int a[]={1,2,3,4,2,4,5,6,7,8,2,1};
	int i,j;
	Set<Integer> duplicates=new HashSet<Integer>();
	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
				duplicates.add(a[i]);
		}
			
	}
	System.out.print("Given Input: ");
	for(i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println("\nDuplicates: "+duplicates);
	
}
}
