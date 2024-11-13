package com.sunbeam;

import java.util.Scanner;

public class ArrayOfInteger {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		Stack st2 = new Stack(5);
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1.Push on statck1\n2.Pop from stack1\n3.Display stack\nEnter the choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(st.isFull()) {
					System.out.println("Stack is full....");
				}
				else {
					System.out.println("Enter the value to push on stack: ");
					int val= sc.nextInt();
					st.push(val);
					System.out.println("Value pushed sucessfully");
					System.out.println("__________________________________________________");
				}
				break;
				
			case 2:
				if(st.isEmpty()) {
					System.out.println("Stack is empty.....");
				}
				else {
					int temp = st.pop();
					System.out.println("Poped elemet is : "+ temp);
					System.out.println("Value poped sucessfully");
					System.out.println("__________________________________________________");
					
					st2.push(temp);
				}
				break;

			case 3:
				System.out.println("stack1 array: ");
				st.stackDisplay();
				
				System.out.println("stack1 array: ");
				st2.stack2Display();
				System.out.println("__________________________________________________");
				
				break;
			default:
				System.out.println("Invalid choice.....");
				break;
			}
		}while(choice != 0);
	}

}
