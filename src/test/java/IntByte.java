

class A
{
	public void add(int a, byte b)
	{
		System.out.println("Int,byte called");
	}
	public void add(int a, int b)
	{
		System.out.println("Int,Int called");
	}

}

public class IntByte {
public static void main(String args[])
{
	A a=new A();
	a.add(4, 5);
	a.add(4, 256);
	
}
}
