

public class ThreadsDeadlock {

	public static void main(String args[])
	{
		final Runner runner=new Runner();
		
		Thread t1=new Thread(new Runnable()
				{
					public void run(){
						runner.firstThread();
					}
				});
			
		Thread t2=new Thread(new Runnable()
		{
			public void run(){
				runner.secondThread();
			}
		});
	
		
		t1.start();
		t2.start();
		
		runner.finished();
	}
}
