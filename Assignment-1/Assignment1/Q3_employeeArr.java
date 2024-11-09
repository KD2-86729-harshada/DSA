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

	public Employee(int id, String name) {
		super();
		this.setId(id);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
public class Q3_employeeArr {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
//		list.add(10, "Harsha");
//		list.add(20, "Pari");
		Scanner sc = new Scanner(System.in);
		list.add(new Employee(40, "Harsha"));
		list.add(new Employee(50, "Pari"));
		list.add(new Employee(60, "Shreya"));
		list.add(new Employee(30, "Ananya"));
		list.add(new Employee(20, "Trisha"));
		list.add(new Employee(10, "Narayani"));
		
		System.out.println("Array : "+list.toString());
		
		searchEmp(sc.nextInt());
	}

	private static int searchEmp(int i) {
		if(Employee.id == sc.nextInt())
			return 0;
		
	}
}
