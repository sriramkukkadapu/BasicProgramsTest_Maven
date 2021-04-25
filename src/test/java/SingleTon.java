

class SingleTonClass
{
private static SingleTonClass singleton=new SingleTonClass();
//public static int objCount=0;

private SingleTonClass()
{ //objCount++; 
	
}

public static SingleTonClass getInstance()
{return singleton;
}

public void demoMethod()
{
	//System.out.println("No of objects :"+objCount);
	System.out.println("Demo method");
}
}

public class SingleTon {
public static void main(String a[])
{
	SingleTonClass obj;
	obj=SingleTonClass.getInstance();
	obj.demoMethod();
	System.out.println(obj.hashCode());
	
	SingleTonClass obj2;
	obj2=SingleTonClass.getInstance();
	obj2.demoMethod();
	System.out.println(obj2.hashCode());
}
}
