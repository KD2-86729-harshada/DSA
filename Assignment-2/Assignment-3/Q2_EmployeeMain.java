package com.sunbeam.p1;


public class Q2_EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee emp[] = new Employee[5];
		emp[0] = (new Employee("Harsha", 5000));
		emp[1] = (new Employee("Pariii", 2000));
		emp[2] = (new Employee("Shreya", 3000));
		emp[3] = (new Employee("Trisha", 1000));
		emp[4] = (new Employee("Narayani", 20000));
		
		System.out.println("__________Employee List Before Sort___________");
		for(int i=0; i< emp.length; i++)
		{
			System.out.println(emp[i].toString()+" ");
		}
		System.out.println();
		
		sortBySalary(emp,emp.length);
		
		System.out.println("__________Employee List After Sort___________");
		for(Employee employee : emp)
		{
			System.out.println(employee.toString());
		}
	}

	private static void sortBySalary(Employee[] emp, int length) {
		
		for(int i=1; i<length; i++)
		{
			Employee temp = emp[i];
			int j;
			for(j = i-1; j>=0 && emp[j].getSalary()> temp.getSalary(); j--)
			{
				emp[j+1] = emp[j];
			}
			emp[j+1] = temp;
		}
	}

}
