

public class Anagrams2 {
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("aabc");
		StringBuffer tempStr,swapBuffer;
		int i,j;
		
		tempStr=s;
		for(i=0;i<s.length();i++)
		{
			//now consider s[i] is fixed we need to swap all locations chars with s[i]
			for(j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)){}
				else
				{
					swapBuffer=s;
					System.out.println(swap(swapBuffer,i,j));
				}
				s=tempStr;
			}
			s=tempStr;
		}
		
		/*
		for(i=0;i<s.length();i++)
		{
			tempStr=s;
			for(j=0;j<tempStr.length();j++)
			{
				//if(s.charAt(i)!=s.charAt(j))
				System.out.println(swap(tempStr,i,j));
				tempStr=s;
			}
			
			
		}*/
		
	}
	public static StringBuffer swap(StringBuffer s,int i,int j)
	{
		char c1=s.charAt(i);
		char c2=s.charAt(j);
		
		s.setCharAt(i, c2);
		s.setCharAt(j, c1);
		
		return s;
	}

}
