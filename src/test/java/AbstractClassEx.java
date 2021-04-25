
abstract class Shape
{
	int dim1,dim2;
	
	abstract public void area();
	
	public void print()
	{
		System.out.println("print method in abstract class"+dim1+" "+dim2);
	}
}

class Rectangle extends Shape
{

	Rectangle(int dim1,int dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public void area()
	{
		System.out.println("Area of Rectangle is : "+dim1*dim2);
	}
}


public class AbstractClassEx {
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle(5,3);
		s.print();
		s.area();
		
	}

}
