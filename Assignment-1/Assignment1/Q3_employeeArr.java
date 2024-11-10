package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee
{
	private int id;
	private String name;
	
	public Employee() {
	}

	public Employee(int id)
	{
		this.id = id;
	}
	
	public Employee(String name)
	{
		this.name= name;
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}

public class Q3_employeeArr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		Employee emp[] = new Employee[5];
		emp[0] = (new Employee(40, "Harsha"));
		emp[1] = (new Employee(50, "Pariii"));
		emp[2] = (new Employee(30, "Shreya"));
		emp[3] = (new Employee(20, "Trisha"));
		emp[4] = (new Employee(10, "Narayani"));
		
		System.out.println("_____________________Employee List_____________________");
		for(int i=0; i< emp.length-1; i++)
		{
			System.out.println(emp[i].toString()+" ");
		}
		
		do
		{
			System.out.println("0.Exit\n1.Search Employee by Id\n2.Search Emploee by name");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.exit(0);
				break;
				
			case 1:
				System.out.println("_________________Serach by id_____________________");
				System.out.print("Enter the id to be search : ");
				int id = sc.nextInt();
				Employee empId = searchById(emp, new Employee(id));
				System.out.println(empId);
				System.out.println("_________________Thank you_____________________");
				break;

			case 2:
				System.out.println("_________________Serach by name_____________________");
				System.out.print("Enter the name to be search : ");
				String name = sc.next();
				Employee empName = serachByName(emp, new Employee(name));
				System.out.println(empName);
				System.out.println("_________________Thank you_____________________");
				break;
				
			default:
				System.out.println("Invalid choice :( ");
				break;
			}
			
		}while(choice != 0);		
	}
         

	private static Employee searchById(Employee[] emp, Employee e) {
	
		for(int i = 0; i< emp.length-1; i++)
		{
			if(e.getId() == emp[i].getId())
			{
//				System.out.println("index : "+ i);
				return emp[i];
			}
		}
		return null;
	}
	
	private static Employee serachByName(Employee[] emp, Employee e) {
	
		for(int i =0; i< emp.length-1; i++)
		{
			if(e.getName().equals(emp[i].getName()))
			{
				return emp[i];
			}
		}
		return null;
	}
	
	

}
