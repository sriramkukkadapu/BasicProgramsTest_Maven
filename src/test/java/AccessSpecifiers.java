

public class AccessSpecifiers {
public static void main(String args[])
{
	A1 a=new A1(2,3);
	B1 b=new B1(3,4);
}
}

class A1
{
	int i,j;
	
	A1()
	{
		
	}
	A1(int i, int j)
	{
		this.i=i;
		this.j=j;
		
		print();
	}
	
	public void print()
	{
		System.out.println(this.i+" "+this.j);
	}
}

class B1 extends A1
{
	int k;
	
	B1()
	{
		super();
		print();
	}
	B1(int i,int j)
	{
		super(i,j);
		print();
	}
	
	public void print()
	{
		System.out.println(i+" "+j);
	}
}
