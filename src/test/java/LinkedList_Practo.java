

public class LinkedList_Practo{
	 
    public static void main(String args[])
    {
           linkedlist list=new linkedlist();
          
           System.out.println("List Empty : "+list.empty());
           list.display();
           list.insert(1);
           list.insert(2);
           list.insert(3);
           list.display();
           System.out.println("\nDeleting position 1");
           list.delete(1);
           list.display();
           list.insert(4);
           list.insert(5);
           list.insert(6);
           list.display();
           System.out.println("\nDeleting position 3");
           list.delete(3);
           list.display();
           System.out.println("\nDeleting last node");
           list.delete(4);
           list.display();
          
           
           //System.out.println("\nPritning reverse of elements using recursion:");
           //list.reverse_order(list.head);
           
           list.insert(6);
           list.insert(7);
           list.insert(8);
           list.insert(9);
           list.display();
 
           
           System.out.println("\nFinding middle element in the list(using iteration): ");
           int mid=list.findMiddle();
           System.out.println(mid);
           
           System.out.println("\nFinding middle element in the list(using array): ");
           mid=list.findMiddle_UsingArray();
           System.out.println(mid);
           
           list.deleteByValue(7);
           list.display();
           list.deleteByValue(8);
           list.display();
           list.deleteByValue(2);
           list.display();
           
           System.out.println("\nReversing the Linked List(Iterative Approach)");
           list.reverseLinkedList();
           list.display();
           
           System.out.println("\nReversing the Linked List(Recursive Approach)");
           list.reverseLinkedList_recursion(list.head);
           list.display();
           
           list.insert(7);
           list.display();
           
           list.swap(5, 6);
           list.display();
           
           
    }
   


}

class linkedlist
{
    protected node head;
    protected node tail;
    int size;
   
    linkedlist()
    {
           head=null;
           tail=null;
           size=0;     
    }
   
    public boolean empty()
    {
           if(head==null)
                  return true;
           else
                  return false;
    }
   
    public void insert(int v)
    {
    	System.out.println("Inserting: "+v);
           node new_node=new node(v,null);
           //if head null this is first node.
           if(head==null)
           {     
                  head=new_node;
                  tail=new_node;
                 
           }
           else
           //append to tail
           {
        	   node temp=head;
                 
        	   while(temp.next!=null)
                	  temp=temp.next;
                 
               temp.next=new_node;
           }
          
           size++;
    }
   
    public void deleteByValue(int target)
    {
    	//System.out.println("Deleting by value...");
    	
    	node prev=null;
    	node temp=head;
    	
    	//if 1st node
    	if(head.value==target)
    		head=head.next;
    	else
    	{
    		while(temp.value!=target)
    		{
    			prev=temp;
    			temp=temp.next;
    		}
    		prev.next=temp.next;
    	}
    	
    	System.out.println("\nDeleting Node: "+temp.value);
    	
    }
    
    public void delete(int position)
    {
           //3 cases 1st node last node middle node
           if(position==1) //1st node
           {
                  head=head.next;
                  size--;
           }
           else if(position>1 && position<size) //intermediate node
           {
                  //navigate till the prev node
                  node prev=head;
                  node target=head.next;
                 
                  int current=2;
                  while(position!=current)
                  {
                        prev=target;
                        target=target.next;
                        current++;
                  }
                 
                  //now we have target and its previous node also
                  prev.next=target.next; //link changed
                  size--;
           }
          
           else if(position == size)//last node
           {
                  //navigate till prev node of last node and put next as null
                  node temp=head;
                  int i=1;
                  while(i<position-1)
                  {
                        temp=temp.next;
                        i++;
                  }
                  //we are in last but one node
                  temp.next=null;
                  tail=temp;
                  size--;
           }
           else
                  System.out.println("invalid position given");
          
           System.out.println("Node deleted at posn : "+position);
           System.out.println("Now last node is: "+tail.value);
 
          
    }
   
    public boolean is_present(int key)
    {

           node temp=head;
          
           while(temp!=null)
           {
                  if(temp.value==key)
                        return true;
                  else
                        temp=temp.next;
           }
           return false;
    }
   
    public void display()
    {
           if(empty()==true)
                  System.out.println("List is Empty");
           else
           {
                  node temp=head;
                  System.out.println("List : ");
                  while(temp!=null)
                  {
                        System.out.print(temp.value+" ");
                        temp=temp.next;
                  }
           }
    }
   
    public void reverse_order(node n)
    {
           if(n.next!=null) reverse_order(n.next);
           System.out.print(n.value+" ");
           if(n.next==null)
                  return;
          
           /* printing in same order
             System.out.println(n.value);
           if(n.next==null)
                  return;
           else
                  reverse_order(n.next); */
                 
    }
    
    public int findMiddle()
    {	//This is from : http://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
    	//1 more way is to put all elements in array by traversing only once then we can calc size of array and print middle one ;)
    	int mid=-1;
    	
    	node slow_ptr=head;
    	node fast_ptr=head;
    	
    	while(fast_ptr!=null && fast_ptr.next!=null)
    	{
    		fast_ptr=fast_ptr.next.next;
    		slow_ptr=slow_ptr.next;
    	}
    	mid=slow_ptr.value;
    	return mid;
    }
    

    public int findMiddle_UsingArray()
    {	//This is from : http://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
    	//1 more way is to put all elements in array by traversing only once then we can calc size of array and print middle one ;)
    	int mid=-1;
    	node temp=head;
    	
    	String str=null;
    	while(temp!=null)
    	{
    		str=str+" "+temp.value;
    		temp=temp.next;
    	}
    	String a[]=str.split(" ");
    	int size=a.length;
    	
    	mid=Integer.parseInt(a[size/2]);
    	return mid;
    }
    
    public void reverseLinkedList()
    { //iterative approach using loop
    	//https://www.youtube.com/watch?v=sYcOK51hl-A
    	
    	node prev=null;
    	node current=head;
    	node next; //temp var to store next nodes address to not loose the info of next
    	
    	while(current!=null)
    	{
    		next=current.next;
    		current.next=prev;
    		prev=current;	//like fibonacci how  a=b and b=c
    		current=next;
    	}
    	head=prev;
    }
 
    public void reverseLinkedList_recursion(node p)
    { //iterative approach using recursion
    	//https://www.youtube.com/watch?v=KYH83T4q6Vs
    	
    	if(p.next==null)
    	{
    		head=p;
    		return;
    	}
    	reverseLinkedList_recursion(p.next);
    	node q=p.next;
    	q.next=p;
    	p.next=null;
    	
    }
    
    public void swap(int x, int y)
    {	//http://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-data/
    	System.out.println("\nSwapping "+x+" and "+y);
    	if(x==y) return; 
    	

    	node curX=head,prevX=null,curY=head,prevY=null;
    	
    	//find pos'n and prev of x
    	while(curX.value!=x && curX!=null)
    	{
    		prevX=curX;
    		curX=curX.next;
    	}
    	
    	//find pos'n and prev of y
    	while(curY.value!=y && curY!=null)
    	{
    		prevY=curY;
    		curY=curY.next;
    	}
    	
    	//if x or y is not der then return
    	if(curX==null || curY==null) {System.out.println("X or Y is not present"); return;}
    	
    	
    	if(prevX!=null)//if x is not head
    		prevX.next=curY;
    	else
    		head=curY;
    	
    	if(prevY!=null)//if y is not head
    		prevY.next=curX;
    	else
    		head=curX;
    	
    	node temp=curX.next;
    	curX.next=curY.next;
    	curY.next=temp;
    }
}





class node
{
    protected int value;
    protected node next;
   
    node(int value,node next)
    {
           this.value=value;
           this.next=next;
          
           //System.out.println("node created with data : "+value);
    }
   
    public void set_next(node n)
    {
           this.next=n;
    }
   
    public void set_value(int value)
    {
           this.value=value;
    }
   
    public node get_next()
    {
           return this.next;
    }
   
    public int get_value()
    {
           return this.value;
    }
}
