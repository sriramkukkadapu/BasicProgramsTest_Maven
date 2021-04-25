

public class LongestPallindromicSubsequence {
public static void main(String args[])
{
	//from : https://www.youtube.com/watch?v=43P0xZp3FU4
	
	String input1="abcdefgh";
	String input2="pqbrceuf";
	
	char[] str1=input1.toCharArray();
	char[] str2=input2.toCharArray();
	
	int i,j;
	
	int T[][]=new int[input1.length()][input2.length()];
	int len1=input1.length();
	int len2=input2.length();
	
	for(i=1;i<len1;i++)
	{
		for(j=1;j<len2;j++)
		{
			if(str1[i]==str2[j])
			{
				T[i][j]=T[i-1][j-1]+1;
			}
			else
			{
				T[i][j]=max(T[i-1][j],T[i][j-1]);
			}
		}
	}
	
	//System.out.println("Length: "+);
	
	System.out.println("Result matrix: ");
	
	for(i=0;i<len1;i++)
	{
		for(j=0;j<len2;j++)
		{
			System.out.print(T[i][j]+" ");
		}
		System.out.println("");
	}
}
public static int max(int a,int b)
{
	if(a>b) return a;
	else return b;
}
}
