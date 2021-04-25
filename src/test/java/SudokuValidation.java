
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SudokuValidation {
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter input String");
String input=br.readLine();

//need to identify the sudoku size by identifying the 1st character

int n=Integer.parseInt(input.charAt(0)+"");

//then identify the actual string [sudoku values] by comma

String sudokuValuesString=input.substring(2);
//we need to repeat and put these values in a 2d array

int[][] matrix=new int[n][n];

StringTokenizer st=new StringTokenizer(sudokuValuesString,",");
int col=0,row=0;

while(st.hasMoreTokens())
{
	if(col==4)
	{	row++;
		col=0;
	}
	else
	{
		matrix[row][col]=Integer.parseInt(st.nextToken());
		col++;
	}
}

int i,j;

//display converted matrix to user
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.print(matrix[i][j]+" ");
	}
	System.out.println("");
}

//call validate matrix method
boolean valid=validateMatrix(matrix,n);
if(valid)System.out.println("Final Result : "+valid);
else System.out.println("Final Result : "+valid);

}

public static boolean validateMatrix(int a[][],int n)
{
	boolean valid=true;
	
	int i,j;

	
	for(i=0;i<n;i++)
	{
		System.out.println("Row "+(i+1));
		for(j=0;j<n;j++)
		{
			valid=validateItem(i,j,a,n);
			System.out.println("Item validating "+a[i][j]+ " : "+valid);
			if(valid==false) return valid;
		}
	}
	
	return valid;
}

public static boolean validateItem(int row,int col, int a[][],int n)
{
	boolean valid=true;
	int i,j;
	
	//checking row
	int ele=a[row][col];
	for(i=0;i<n;i++)
	{
		if(i!=col && a[row][i]==ele)//means any other ele apart from target ele is matching wid target ele in that row makes this sudoku invalid
		{
			valid=false;
			return valid;
		}
		
	}
	//System.out.println("Row validation success");
	
	//System.out.println("Doing column validation");
	//checking column
	for(i=0;i<n;i++)
	{

		if(i!=row && a[i][col]==ele)//means any other ele apart from target ele is matching wid target ele in that row makes this sudoku invalid
		{
			valid=false;
			return valid;
		}
	}
	//System.out.println("Column validation success");	
	return valid;
}
}
