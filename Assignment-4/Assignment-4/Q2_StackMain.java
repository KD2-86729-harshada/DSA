package com.sunbeam;

public class StackMain {

	public static void main(String[] args) {
		LinkedList stack = new LinkedList();
		LinkedList queue = new LinkedList();
		
		
		System.out.println("STACK");
		stack.addFirst(50);
		stack.addFirst(40);
		stack.addFirst(30);
		stack.addFirst(20);
		stack.addFirst(10);
		stack.display();
		
		stack.deleteFirst();
		
		System.out.println("After Popping Elemenyt from Stack");
		stack.display();
		stack.peek();
		
		System.out.println("QUEUE");
		queue.addLast(100);
		queue.addLast(90);
		queue.addLast(80);
		queue.addLast(70);
		queue.addLast(60);
		queue.addLast(50);
		
		queue.display();
		queue.deleteFirst();
		System.out.println("After deleteing element from Queue");
		queue.display();
		
		queue.peek();
		
		
		
	}

}