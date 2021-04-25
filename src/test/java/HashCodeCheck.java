


public class HashCodeCheck {
public static void main(String args[])
{
Foo f=new Foo();
Foo f2=new Foo();

System.out.println("Hash code for 2 objects");

System.out.println(f.hashCode());
System.out.println(f2.hashCode());

System.out.println("Hash code of 2 strings");
String s1=new String("abc");
String s2=new String("abc");

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

System.out.println("Hash code for 2 String buffer objects");

StringBuffer sb1=new StringBuffer("abc");
StringBuffer sb2=new StringBuffer("abc");

System.out.println(sb1.hashCode());
System.out.println(sb2.hashCode());
	
}
}
