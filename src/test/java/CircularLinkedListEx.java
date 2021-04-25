

public class CircularLinkedListEx{
	 
    public static void main(String args[])
    {
           circularlinkedlist list=new circularlinkedlist();
          
           System.out.println("List Empty : "+list.empty());
           list.display();
           list.insert(1);
           list.insert(2);
           list.insert(3);
           list.insert(4);
           list.insert(5);
           list.display();
     }
   


}

class circularlinkedlist
{
    protected node head;
    protected node tail;
    protected node prevof_head=null;
    int size;
   
    circularlinkedlist()
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
           }
           else
           //append to tail
           {
        	   node temp,prev=null;
        	  if(head.next==null)//only head is der
        	  {
        		  head.next=new_node;
        		  new_node.next=head;
        	  }
               
        	  else
        	  {
        		  //list has 2 or more nodes.
        		  temp=head.next;
        		  while(temp!=head)
        		  {
        			  prev=temp;
        			  temp=temp.next;
        		  }
        		  prev.next=new_node;
        		  new_node.next=head;
        	  }
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
                  System.out.print(head.value+" ");
                  temp=temp.next;
                  while(temp!=head)
                  {
                        System.out.print(temp.value+" ");
                        temp=temp.next;
                  }
           }
    }
   
    
    
   
    

   
    
 
    
    
   
}
