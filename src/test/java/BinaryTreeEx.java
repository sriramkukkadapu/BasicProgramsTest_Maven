
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeEx {
public static void main(String args[])
{
	System.out.println("Binary Tree");
	BinaryTree tree=new BinaryTree();
	/*tree.insert(3);
	//System.out.println("root: "+tree.root.data+"("+tree.root.left+","+tree.root.right+")");
	tree.insert(2);
	//System.out.println(tree.root.data+"\n("+tree.root.left.data+","+tree.root.right+")");
	//System.out.println(tree.root.left.data+"("+tree.root.left+","+tree.root.right+")");
	tree.insert(1);
	System.out.println(tree.root.data);
	System.out.println(tree.root.left.data);
	System.out.println(tree.root.left.left.data);
	//System.out.println("right "+tree.root.right.data);*/
	/*
	tree.insert(2);
	tree.insert(1);
	tree.insert(3);
	
	System.out.println("\nIn-order traversal...");
	tree.inOrder(tree.root);
	System.out.println("\nPre-order traversal...");
	tree.preOrder(tree.root);
	System.out.println("\nPost-order traversal...");
	tree.postOrder(tree.root);
	
	System.out.println("\n=========New Tree========");
	*/
	tree=new BinaryTree();//new tree			4
									//		  /	  \
	tree.insert(4);					//  	 2 	   6
	tree.insert(2);					//	   /  \	  /	 \	
	tree.insert(1);					//	  1	  3  5	  7	
	tree.insert(3);
	tree.insert(6);
	tree.insert(5);
	tree.insert(7);
	
	System.out.println("Inorder Itreative Approach");
	tree.inorderIterative(tree.root);
	
	System.out.println("\nPreorder Itreative Approach");
	tree.preorderIterative(tree.root);
	
	System.out.println("\nPostorder Itreative Approach");
	tree.postorderIterative(tree.root);
	
	System.out.println("\nHeight of Binary Tree : "+tree.findHeight(tree.root));
	
	LinkedList<Integer> result=new LinkedList<Integer>();
	int targetSum=17;
	tree.rootToLeafSum(tree.root,targetSum ,result );  //4,2,3 =9
	System.out.print("Path to reach sum "+targetSum+" is: ");
	Iterator itr=result.iterator(); 
	while(itr.hasNext()) 
	{
		System.out.print(itr.next()+" ");
	} System.out.println("");
	
	//printing all leaf nodes
	System.out.print("Printing all Leaf Nodes of tree: ");
	tree.printAllLeafNodes(tree.root); System.out.println("");
}
}

class BinaryTree
{
	Node2 root=null;
	
	public void insert(int data )
	{
		insertIntoTree(data);
	}
	
	public void insertIntoTree(int data)
	{
		Node2 n=new Node2(data);
		
		if(root==null)
		{
			root=n;
		}
		else
		{
			
			Node2 r=root;
			Node2 prev=root;
			while(r!=null)
			{
				prev=r;
				//System.out.println(r.data);
				if(data<r.data) //insert left side
					{
					//r.left=n;
					System.out.println("going left side of "+r.data);
					r=r.left;
					}
				else if(data>r.data)
					{
					//r.right=n;
					System.out.println("going right side of "+r.data);
					r=r.right;
					}
				else
					break;
			}
			
			if(data<prev.data) prev.left=n;
			else if(data>prev.data) prev.right=n;
		}
		
		System.out.println(data+" inserted");
		//return root;
	}
	
	/* This function finds the height of BST */
	public int findHeight(Node2 root)
	{
		if(root==null) return 0;
		
		int leftHeight=findHeight(root.left);
		int rightHeight=findHeight(root.right);
		
		return max(leftHeight,rightHeight)+1;
	}
	
	/* this gives path in BST to reach sum of that total nodes = 26 ex*/
	public boolean rootToLeafSum(Node2 root,int sum,LinkedList<Integer> result)
	{
		if(root==null) return false;
		if(root.left==null && root.right==null) //leaf node
		{ //check if the total sum in current path is equal to req sum or not
			if(root.data==sum){
				result.add(root.data);
				return true;
			}
			else {	return false; }
		}
		if(rootToLeafSum(root.left,sum-root.data,result))
		{
			result.add(root.data);
			return true;
		}
		if(rootToLeafSum(root.right,sum-root.data,result))
		{
			result.add(root.data);
			return true;
		}
		
		return false;
	}

	/* This function calls isBST with infini values on left and right side*/
	public boolean isBST(Node2 root){
	    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	/* This function returns a Bin tree is BST or not by takiing with infini values on left and right side*/
	private boolean isBST(Node2 root, int min, int max){
	    if(root == null){
	        return true;
	    }
	    if(root.data <= min || root.data > max){
	        return false;
	    }
	    return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}
	
	public void printAllLeafNodes(Node2 root)
	{
		if(root==null)
			return;
		else{
		printAllLeafNodes(root.left);
		if(root.left==null && root.right==null)
		System.out.print(root.data+" ");
		printAllLeafNodes(root.right);
		}
	}
	
	public void inorderIterative(Node2 root)
	{
		if(root==null) return; //empty tree means just return
		Stack<Node2> s=new Stack<Node2>();
		while(true)
		{
			if(root!=null)
			{
				s.push(root);
				root=root.left;
			}
			else
			{
				if(s.isEmpty()) break; // if stack empty just break
				
				root=s.pop();
				System.out.print(root.data+" ");
				root=root.right;
			}
		}
	}
	
	public void preorderIterative(Node2 root)
	{
		if(root==null) return; //empty tree means just return
		Stack<Node2> s=new Stack<Node2>();
		s.add(root);
		while(!s.isEmpty())
		{
			root = s.pop();
			System.out.print(root.data+" ");
			
			if(root.right!=null)
				s.push(root.right);
			if(root.left!=null)
				s.push(root.left);
			
		}
	}
	
	public void postorderIterative(Node2 root)
	{
		if(root==null) return; //empty tree means just return
		Stack<Node2> s=new Stack<Node2>();
		s.push(root);
		while(!s.isEmpty())
		{
			root = s.pop();
			System.out.print(root.data+" ");

			if(root.left!=null)
				s.push(root.left);

			if(root.right!=null)
				s.push(root.right);

			
		}
	}
	
	public void inOrder(Node2 Node2)
	{
		
		if(Node2==null)
			return;
		else{
		inOrder(Node2.left);
		System.out.print(Node2.data+" ");
		inOrder(Node2.right);
		}
	}
	
	public void preOrder(Node2 Node2)
	{
		
		if(Node2==null)
			return;
		else{
		System.out.print(Node2.data+" ");
		preOrder(Node2.left);
		preOrder(Node2.right);
		}
	}
	
	public void postOrder(Node2 Node2)
	{
		
		if(Node2==null)
			return;
		else{
		postOrder(Node2.left);
		postOrder(Node2.right);
		System.out.print(Node2.data+" ");
		}
	}
	
	/* just returns max of 2 integers - used this in max height of BST function*/
	public int max(int a,int b)
	{
		if(a>b) return a;
		else return b;
	}
}




class Node2
{
	Node2 left;
	Node2 right;
	int data;
	
	Node2(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
