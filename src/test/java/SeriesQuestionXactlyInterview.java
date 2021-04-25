

public class SeriesQuestionXactlyInterview {
public static void main(String args[])
{
	int noOfSets=5;
	int i=0,j,middleElement=3,lastElement=9;
	int a[]=new int[noOfSets*3];
	
	a[0]=1;
	a[1]=3;
	a[2]=9;
	
	System.out.print(a[i]+","+a[i+1]+","+a[i+2]+",");
	
	for(i=3;i<noOfSets*3;i=i+3)
	{
		a[i]=1;
		
		a[i+1]=middleElement*2;
		
		a[i+2]=lastElement*2;
		
		middleElement=a[i+1];
		lastElement=a[i+2];
		
		
			System.out.print(a[i]+","+a[i+1]+","+a[i+2]+",");
			
			
	}
	
}
}
