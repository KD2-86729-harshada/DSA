package com.sunbeam;

import java.util.Scanner;

public class SinglLinearListMain {

	public static void main(String[] args) {
		
		singleLinearList list = new singleLinearList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1.Push after the present data\n2.push before given data\n3.Display List");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("______________________LIST_______________________");
				System.out.print("Enter the Element to add after the given data : ");
				int value = sc.nextInt();
				list.addLast(value);
				System.out.println("****Element added sucessfully****");
				break;
				
			case 2:
				System.out.println("______________________LIST_______________________");
				System.out.println("Enter the Element to add Before the given data :");
				int val = sc.nextInt();
				list.addFirst(val);
				System.out.println("****Element added sucessfully****");
				break;
				
			case 3:
				System.out.println("______________________LIST_______________________");
				if(list.isEmpty()) {
					System.out.print("List is empty");
				}
				else
					list.display();
				
				System.out.println("______________________Thank you_______________________");
				break;

			default:
				break;
			}
		
		}while(choice != 0);

	}

}
