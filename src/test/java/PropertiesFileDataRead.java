

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesFileDataRead {
public static void main(String args[])
{
	ResourceBundle bundle=ResourceBundle.getBundle("PropertiesFile");
	
	//getting a specific property
	
	String name=bundle.getString("Name"); //we should pass the key
	System.out.println("Name: "+name);
	
	System.out.println("===============");
	System.out.println("All Properties");
	System.out.println("===============");
	
	//to print all properties, 1st get all properties and then loop through them
	Set keySet=bundle.keySet();
	Iterator itr=keySet.iterator();
	
	while(itr.hasNext())
	{
		String key=itr.next().toString();
		String value=bundle.getString(key);
		System.out.println(key+"="+value);
	}
}
}
