

class TestStaticClass2
{
	final float pi=3.14F;
}

public class staticex2 {

	public static void main(String ags[])
	{
		TestStaticClass2 a=new TestStaticClass2();
		TestStaticClass2 b=new TestStaticClass2();
		
		System.out.println(a.pi);
		System.out.println(b.pi);
		//a.pi=5; this is not allowed
		System.out.println(b.pi);
	}
}
