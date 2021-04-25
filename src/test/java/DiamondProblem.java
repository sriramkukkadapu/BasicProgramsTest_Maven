

/*
interface Interface1 {
    default public void foo() { System.out.println("Interface1's foo"); }
}
interface Interface2 {
    default public void foo() { System.out.println("Interface2's foo"); }
}

class TestDiamond implements Interface1,Interface2
{
	public void foo() {
		Interface1.super.foo();
	}
	
}

public class DiamondProblem  {
   public static void main(String args[])
   {
	   TestDiamond t=new TestDiamond();
	   t.foo();
   }
}
*/
