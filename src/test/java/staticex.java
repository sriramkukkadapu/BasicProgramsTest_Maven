

class TestStaticClass
{
	static float pi=3.14F;
}

public class staticex {

	public static void main(String ags[])
	{
		TestStaticClass a=new TestStaticClass();
		TestStaticClass b=new TestStaticClass();
		
		System.out.println(a.pi);
		System.out.println(b.pi);
		a.pi=5;
		System.out.println(b.pi);
	}
}
