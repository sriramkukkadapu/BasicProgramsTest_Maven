

public class Anagrams {
	public static void main(String args[])
	{
		char[] actualS={'a','b','c'};
		String tempStr=new String(actualS);
		char[] s=tempStr.toCharArray();
		
		int i,j;
		
		//start with s
		for(i=0;i<s.length;i++)
		{
			//i is fixed means dont touch when i==j
			for(j=0;j<s.length;j++)
			{
				if(i!=j)
				{
					//swap and print
					char temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
					System.out.println(new String(s));
				}
				
				//now assign s as actual string
				tempStr=new String(actualS);
				s=tempStr.toCharArray();
				
			}
			//tempStr=new String(actualS);
			//s=tempStr.toCharArray();
		}
	}
	

}
