package com.sunbeam;

public class SinglelyCircular {

	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int size;
	
	public SinglelyCircular() {
		size = 0;
		tail = null;
	}
	

	public boolean isEmpty(){
		return tail == null;
	}
	
	public void addFirst(int value) {
		
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
			
		else {
			
			newnode.next = tail.next;
			tail.next = newnode;
			//tail = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
			
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}
	
	public void addPostion(int value, int pos) {
		
		Node newnode = new Node(value);
		
		if(pos < 1 && pos > size+1) 
			return;
		
		else if(tail == null)
			return;
		
		else if(pos == 1)
			addFirst(value);
		
		else {
			Node trav = tail;
			for(int i = 0; i< pos - 1; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
		}
		
		size++;
	}
	
	
	
	public void disply() {
		if(isEmpty())
			{return;
			
			}
	
		Node trav = tail;
		System.out.println("List : ");
		do {
			
			System.out.print(trav.next.data + " ");
			trav = trav.next;
		
		}while(trav != tail);
		System.out.println();
//		System.out.println("Last node : "+trav.data);
	}
}
