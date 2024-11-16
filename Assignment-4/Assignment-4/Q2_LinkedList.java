package com.sunbeam;

public class LinkedList {

	public static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		
		Node newNode=new Node(value);
		if(isEmpty())
		{
			head=newNode;
		}
		
		else 
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	
	public void addLast(int value)
	{
		
		Node newNode=new Node(value);
		if(isEmpty())
		{
			head=newNode;
		}
		
		else
		{
			Node trav=head;
			
			while(trav.next!=null)
			{
				trav=trav.next;
			}
			trav.next=newNode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			return;
		}
		else {
			head=head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			Node trav=head;
			
			while(trav.next.next!=null)
			{
				trav=trav.next;
			}
			trav.next=null;
		}
	}
	
	public void display()
	{
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println();
	}
	public void peek()
	{
		
		System.out.println("Peeked Element- "+head.data);
	}
	
	
	
}