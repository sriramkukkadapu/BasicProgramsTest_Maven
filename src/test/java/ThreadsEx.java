

public class ThreadsEx {
public static void main(String args[])
{
	ThreadDemo t1=new ThreadDemo();
	ThreadDemo t2=new ThreadDemo();
	
	t1.start();
	t2.start();
}
}

class ThreadDemo extends Thread
{
	public void run()
	{
		// print 1 to 5 numbers;
		
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}
