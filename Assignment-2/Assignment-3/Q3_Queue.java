package com.sunbeam;

public class Queue {

	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	public Queue(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		rear++;
		arr[rear] = value;
	}
	
	public int pop()
	{
		int temp = arr[front+1];
		front++;
		return temp;
	}
	

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == SIZE-1;
	}
	
}
