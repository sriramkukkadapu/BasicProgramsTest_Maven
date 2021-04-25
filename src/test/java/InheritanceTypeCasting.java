

class B
{
	public void multiply()
	{
		System.out.println("called multiply method from B");
	}
}
class C extends B
{
	public void division()
	{
		System.out.println("called division method from C");
	}
}

public class InheritanceTypeCasting {
	public static void main(String args[])
	{
		B b1=new B();
		C c1;
		c1=(C) b1;
		
		c1.division();
		c1.multiply();
		
	}

}
