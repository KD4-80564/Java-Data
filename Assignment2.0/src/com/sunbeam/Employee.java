package com.sunbeam;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

//Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//functionality:

class Emp
{
	private int id;
    private String name;
    private double salary;

    // Constructor
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Emp()
    {}

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to accept employee information
    public void accept() {
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee Id: ");
        id=sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
public class Employee {
	public static void main(String []sahil)
	{
	LinkedList<Emp> E1 = new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	Emp e;
	int choice=0;
	 do{
         System.out.println("\nEmployee Management Menu:");
      
         System.out.println("1. Add Employee");
         System.out.println("2. Delete Employee");
         System.out.println("3. Find Employee");
         System.out.println("4. Sort Employees by ID");
         System.out.println("5. Edit Employee");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
	
	 switch (choice) {
     case 1:
     {
    	 e=new Emp();
    	 e.accept();
    	 E1.addFirst(e);  
    	   System.out.println("Employee added successfully.");    	 
     }break;
     case 2: //Delete Employee
     {
    	 System.out.println("Enter Employee ID to delete: ");
         int deleteId = sc.nextInt();
         for (Emp em : E1) {
         if (em.getId() == deleteId) {
             E1.remove(em);
             System.out.println("Employee deleted successfully.");
         }
     }break;
	}
     case 3://Find Employee
     {
    	  System.out.println("Enter Employee ID to find: ");
          int findId = sc.nextInt();
          for(Emp em:E1)
          {
                  if (em.getId() == findId) {
                      System.out.println("Employee found: " + em);
                      break;
                  }
          }
     }
     break;
    
     case 4://Sort Employees by ID
     {
    	 class StringComparator implements Comparator<Emp> {
     		@Override
     		public int compare( Emp e1,Emp e2) {
     			int diff =e1.getId()-e2.getId() ;
     			return diff;
     		}}
    	 StringComparator scom=new StringComparator();
    	 Collections.sort(E1, scom);
    	 for(Emp em:E1)
    	 {
    		 System.out.println(em);
    	 }
     }
     break;
     case 5:
     {
    	 System.out.println("Enter emp id to be modified: ");
    	 int id = sc.nextInt();
    	 Emp key = new Emp();
    	 key.setId(id);
    	 int index = E1.indexOf(key);
    	 if(index == -1)
    	 System.out.println("Employee not found.");
    	 else {
    	 Emp oldEmp = E1.get(index);
    	 System.out.println("Employee Found: " + oldEmp);
    	 System.out.println("Enter new information for the Employee");
    	 Emp newEmp = new Emp();
    	 newEmp.accept();
    	 E1.set(index, newEmp);
     }
     }
     break;
     case 6:
     {
             System.out.println("Exiting the program.");
         System.exit(0);
      	 
     }
}
	 }while(choice==1);
	}//main
}