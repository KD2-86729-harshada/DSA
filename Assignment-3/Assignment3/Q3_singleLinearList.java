package com.sunbeam;

public class singleLinearList {

	static class Node{
		private int data;
		private Node next;
		
		public Node(int value ) {
			data = value;
			next = null;
		}
	}
	private Node head;
	
	public singleLinearList() {
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		
		else
		{
			Node trav = head;
			while(trav.next != null)
			{
				trav = trav.next;
			}
			trav.next = newnode;
		}
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void display()
	{
		Node trav = head;
		while(trav.next != null)
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}	
		System.out.println();
	}
	
}
