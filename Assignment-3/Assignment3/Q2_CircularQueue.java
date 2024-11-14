package com.sunbeam;

public class CircularQueue {

	private int arr[];
	private int front, rear;
	private int count;
	
	public CircularQueue(int COUNT) {
		count = COUNT;
		arr = new int[count];
		front = rear = -1;
	}
	
	public void enque(int value) {
		rear = (rear + 1)% count;
		arr[rear] = value;
		
		count++;
	}
	
	public int deque() {
		int temp = arr[(front+1)% count];
		front = (front+1)% count;
		if(front == rear)
			front = rear = -1;
		
		count --;
		
		return temp;
	}
	
	public boolean isEmpty() {
		return rear == -1 && rear == front;
	}
	
	public boolean isFull() {
		return rear == count-1 && front == -1;
	}
}
