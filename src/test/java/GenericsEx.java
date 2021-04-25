

public class GenericsEx {

	public static < E > void print(E[] a)
	{
		//use for loop to repeat
		for(E elem:a)
		{
			System.out.print(elem+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Integer[] intArr={1,2,3,4,5};
		Double[] doubleArr={1.1,2.2,3.3,4.4,5.5};
		Character[] charArr={'S','R','I','R','A','M'};
		
		print(intArr);
		print(doubleArr);
		print(charArr);
		
	}
}
