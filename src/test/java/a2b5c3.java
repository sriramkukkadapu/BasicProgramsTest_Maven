

public class a2b5c3 {

	public static void main(String args[])
	{
		String a="a2b5c3";
		
		for(int i=0;i<a.length();i=i+2)
		{
			int count=Integer.parseInt(a.charAt(i+1)+"");
			for(int j=1;j<=count;j++)
				System.out.print(a.charAt(i));
		}
	}
	
}
