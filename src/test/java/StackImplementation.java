
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class stack
{
	int a[];
	int top=0;
	int size=0;
	int size_memory;
	
	stack(int size_memory)
	{
		a=new int[size_memory];
		top=-1;
		this.size_memory=size_memory;
	}
	
	public void push(int ele)
	{
		if(top==size_memory-1)
			System.out.println("Stack is full");
		else
		{
			top++;
			a[top]=ele;	
			size++;
		}
	}
	public int pop()
	{
		int ele=-1;
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			System.out.println("Element Deleted : "+a[top]);
			ele=a[top];
			a[top]=-1;
			top--;
			size--;
		}
		
		return ele;
	}
	public void display()
	{
		System.out.print("Stack: ");
		if(top==-1 && size==0)
			System.out.println("is empty");
		else
			{
				for(int i=top;i>=0;i--)
				System.out.print(a[i]+" ");
				System.out.println("");
			}
	}
	
	public boolean isEmpty()
	{
		if(top==-1 && size==0)
			return true;
		else
			return false;
	}
}

public class StackImplementation {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int c,size=0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("Enter the size of stack : ");
		size=Integer.parseInt(br.readLine());
		
		stack s=new stack(size);
		
		while(1>0)
		{
		System.out.println("Choose an operation..");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		System.out.print("Enter your choice : ");
		c=Integer.parseInt(br.readLine());
		switch(c)
		{
		case 1:int ele=0;
			System.out.print("Eneter element to be inserted: ");
			ele=Integer.parseInt(br.readLine());
			s.push(ele);
			break;
		case 2:s.pop();
			break;
		case 3:System.out.println("Size of stack: "+s.size);
			   s.display();
			break;
		case 4://exit
			System.exit(0);
		}
		
		//System.exit(0);
		}
	}

}
