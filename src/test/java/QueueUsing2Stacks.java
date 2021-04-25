

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class queue_2stacks
{
	//int f=0;
	//int r=-1;
	int size=0;
	stack s1;
	stack s2;
	queue_2stacks(int size)
	{
		s1=new stack(size);
		s2=new stack(size);
	}

	
	public void enqueue(int ele)//insert
	{
		//insert should go into stack1
		s1.push(ele);
		System.out.println("Enqueued "+ele);
		System.out.println("s1 size: "+s1.size);
	}
	
	public int dequeue()
	{
		if(s2.isEmpty())
		{
			System.out.println("s2 is empty so transferring elements from s1 to s2");
			//get all elements from s1 and put into s2
			System.out.println("s1 empty? "+s1.isEmpty());
			while(s1.isEmpty()==false)
			{
			int ele=s1.pop();
			System.out.println("Transferring ele: "+ele);
			s2.push(ele);
			}
			System.out.println("Transfer completed");
			s1.display();
		} //all elements from s1 will come in reverse order into s2
		
		//now perform delete from s2
		System.out.println("Performing pop on s2");
		s2.display();
		int ele=s2.pop();
		System.out.println("Dequed: "+ele);
		return ele;
	}
	
	public boolean isEmpty()
	{
		if(s1.isEmpty()==true && s1.isEmpty()==true)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		return (s1.size + s2.size);
	}
	
	public void display()
	{
		s1.display();
		s2.display();
	}
}

public class QueueUsing2Stacks {
public static void main(String args[]) throws NumberFormatException, IOException
{

	queue_2stacks q=new queue_2stacks(5);
	
	int c;
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	
	while(1>0)
	{
	System.out.println("Choose an operation..");
	System.out.println("1.Enqueue");
	System.out.println("2.Dequeue");
	System.out.println("3.Display");
	System.out.println("4.Exit");
	System.out.print("Enter your choice : ");
	c=Integer.parseInt(br.readLine());
	switch(c)
	{
	case 1:	int ele=0;
			System.out.print("Eneter element for enqueue: ");
			ele=Integer.parseInt(br.readLine());
			q.enqueue(ele);
			break;
			
	case 2:	q.dequeue();
			break;
			
	case 3:	System.out.println("Size of Queue: "+q.size());
		   	//System.out.println("Display not implemented yet");
			q.display();
			break;
	case 4://exit
		System.exit(0);
	}
	
	//System.exit(0);
	}
	
}
}
