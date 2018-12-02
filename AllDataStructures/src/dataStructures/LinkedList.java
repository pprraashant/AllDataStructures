package dataStructures;

class LinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public LinkedList()
	{
		
	}
	public LinkedList(int size)
	{
		
	}
	public void printlist()
	{
		Node n= head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void InsertAfterNode(Node prev_node,int data)
	{
		if(prev_node==null)
		{
			System.out.println("The Give previous node does not exist");
		}
		Node new_node=new Node(data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
	}
	public void InsertAtEnd(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head.next=new_node;
		}
		Node last=null;
		last=head;
		while(last.next!=null)
			last=last.next;
		last.next=new_node;
	}
	public void deleteNode(int key)
	{
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp!=null)
		{
			prev.next=temp.next;
		}
		else
		{
			System.out.println(key+"is not found to delete it");
		}
		
	}
	public static void main(String args[])
	{
		LinkedList llist=new LinkedList(0);
		
		llist.head =new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		llist.head.next=second;
		second.next=third;
		//llist.printlist();
		// add new element
		llist.push(0);
		llist.InsertAfterNode(third, 4);
		llist.InsertAtEnd(5);
		llist.InsertAtEnd(6);
		llist.printlist();
		llist.deleteNode(3);
		System.out.println("List after deletion");
		llist.printlist();
	
	}
}
