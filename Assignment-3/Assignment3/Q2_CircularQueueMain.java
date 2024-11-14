package com.sunbeam;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int count = 0;
		
		do {
			System.out.println("1.Enque\n2.Deque\n3.Display queue\nEnter the choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println(count);
				if(q.isFull()) {
					System.out.println("Queue is full...");
				}
				else {
					for(int i=1; i< 5; i++) {
						q.enque(i);
					}
				}
				count++;
				System.out.println(count);
				
				break;
				
			case 2:
				System.out.println(count);
				if(q.isEmpty()) {
					System.out.println("Queue is Empty...");
				}
				else {
					for(int i=0; i< count-1; i++) {
						int ele = q.deque();
						System.out.println("dequed elements : "+ ele);
					}
				}
				break;
				
			case 3:
	
				break;

			default:
				break;
			}
	}while(choice != 0);
	}
}
