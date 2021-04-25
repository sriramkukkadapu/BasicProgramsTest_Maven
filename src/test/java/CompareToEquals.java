

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	
	public String toString()
	{
		String result="";
		result=id+" "+name;
		return result;
	}
	
	public int compareTo(Employee e)
	{
		if(this.id == e.id)
			return 0;
		else if(this.id < e.id)
			return -1;
		else
			return 1;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		
		else if(!(o instanceof Employee))
			return false;
		
		else
		{
			Employee e=(Employee)o;
			if(this.id==e.id && this.name.equals(e.name))
				return true;
			else
				return false;
		}
	}
}



//implement compare to method so that employees are compared by id
public class CompareToEquals {
public static void main(String args[])
{

	Employee e1=new Employee(1,"Sriram");
	Employee e2=new Employee(2,"Cnu");
	Employee e3=new Employee(3,"Manju");
	Employee e4=new Employee(4,"Fadia");
	
	List<Employee> employees=new ArrayList<Employee>();
	
	employees.add(e3);
	employees.add(e2);
	employees.add(e1);
	employees.add(e4);
	
	System.out.println(employees);
	
	System.out.println(e1.compareTo(e2));
	System.out.println(e2.compareTo(e1));
	System.out.println(e1.compareTo(e2));
	
	System.out.println(e1.equals(e2));
	Employee e5=new Employee(1,"Sriram");
	System.out.println(e1.equals(e5));
	
	//Collections.sort(employees);
}
}
