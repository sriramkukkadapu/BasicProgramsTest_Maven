

public class Merge2SortedLinkedLists {
public static void main(String args[])
{
	//https://www.youtube.com/watch?v=j_UNYW6Ap0k
	
	circularlinkedlist p=new circularlinkedlist();
	circularlinkedlist q=new circularlinkedlist();
	System.out.println("Inserting data into P List");
	p.insert(10);
	p.insert(50);
	p.insert(70);
	p.insert(90);
	p.insert(100);
	System.out.println("Inserting data into Q List");
	q.insert(20);
	q.insert(30);
	q.insert(40);
	q.insert(60);
	q.insert(80);
	
	System.out.print("P is: ");
	p.display();
	System.out.println("\nQ is: ");
	q.display();
	
	node s=merge(p.head,q.head); //we have head node of new linked list now just print it
	
	System.out.print("\nMerged/Sorted List is: ");
	while(s!=null)
	{
		System.out.print(s.value+" ");
		s=s.next;
	}
	
}
public static node merge(node p,node q)
{
	node new_head=null;
	
	node s=null; //s points to sorted linked list
	
	if(p==null) return q;
	if(q==null) return p;
	
	if(p!=null && q!=null) //identify the head of sorted list which is smaller in p & 1
	{
		if(p.value<=q.value)
		{
			s=p;
			p=p.next;
		}
		else
		{
			s=q;
			q=q.next;
		}
		
	}
	
	new_head=s; //identified the new head
	
	while(p!=null && q!=null)
	{
		if(p.value<=q.value)
		{
			s.next=p;
			s=p;
			p=p.next;
		}
		else
		{
			s.next=q;
			s=q;
			q=q.next;
		}
		
	if(p==null) { s.next=q; break; }
	if(q==null) { s.next=p; break; }
	}
	
	return new_head; //just return head of new list
}
}
