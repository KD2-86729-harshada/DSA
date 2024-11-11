package com.sunbeam;

import java.util.Scanner;

public class linearQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue q = new Queue(5);
		
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(q.isFull())
				{
					System.out.println("Queue is full...");
				}
				else
				{
					System.out.println("Enter the value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
				
			case 2:
				if(q.isEmpty())
				{
					 System.out.println("Queue is empty....");
				}
				else {
					System.out.println("Poped element is : "+q.pop());
				}
				break;
				
			case 3:
				if(q.isEmpty())
				{
					System.out.println("Enter the value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;

			default:
				break;
			}
		
		}while(choice != 0);
		
	}

}
