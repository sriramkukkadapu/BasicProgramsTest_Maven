

class TestClass
{
	static int max=3,current=0;
	
	public TestClass() throws Exception
	{
		System.out.println("current : "+current);
		if(current>max)
		{
			throw new Exception();
		}
		else
		{
			current++;
		}
		
	}
}


public class ClassWithOnly5Objects {
	public static void main(String args[]) throws Exception
	{
		int i,n=6;
		TestClass TestClassObjects[]=new TestClass[n];
		
		
		for(i=0;i<n;i++)
		{
			System.out.println("Trying to create object : "+i);
			TestClassObjects[i]=new TestClass();
		}
	}
}
