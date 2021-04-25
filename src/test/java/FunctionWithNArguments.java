
class Test2
{
public void print(String ... strings) {
    for (String s : strings)
         System.out.print(s+" ");
    System.out.println("");
}

public void add(int... a)
{
	int sum=0;
	for(int e : a)
	{
		sum=sum+e;
	}
	
	System.out.println("Sum : "+sum);
}
}

public class FunctionWithNArguments {
public static void main(String args[])
{
	Test2 t=new Test2();
	t.print("1","2");
	t.print("1","2","3");
	
	System.out.println("Integers");
	t.add(1,2);
	t.add(1,2,3,4,5);
	t.add(1,2,-3);
}
}
