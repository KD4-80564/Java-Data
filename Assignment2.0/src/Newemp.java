import java.util.Scanner;

/*1. Copy Person class and inherited classes (Employee, Salesman, Manager, SalesManager) from previous assignment/classwork. Implement generic class
Box so that it can store any Person in it. How to get total salary of the Employee in Box?*/
/*
class person
{
public 
String Name;
String Address;
public person(String name, String address) {
	super();
	Name = name;
	Address = address;
}
public String getAddress() {
	return this.Address;
	
}
public void setAddress(String address) {
	Address = address;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "person [Name=" + Name + ", Address=" + Address + "]";
}



}


class Employee extends person
{
	Scanner sc=new Scanner(System.in);
protected
    int id;
    float salary;

   
// public Employee(String name, String address, Scanner sc, int id, float salary) {
	super(name, address);
	this.sc = sc;
	this.id = id;
	this.salary = salary;
}

	

	int getid()
    {
        return this.id = id;
    }
    float getsalary()
    {
        return this.salary = salary;
    }
    void setid(int id)
    {
        this.id = id;
    }
    void setsalary(float salary)
    {
        this.salary = salary;
    }
   void accept()
    {
        // cout << "enter employee data" << endl;
      System.out.println("Enter id");    
      id=sc.nextInt();
       System.out.println("Enter the salary");
       salary=sc.nextFloat();
    }
    void display()
    {
       System.out.println("Id="+this.id);
       System.out.println("salary="+this.salary);
    }
//     float getTotalSal()
//    {
//    	return getsalary();
//    }

float CalculateSal()
{
	System.out.println("Enter the salary=");
	return this.salary=sc.nextFloat();
}

}
// child class (or) derived class
class Manager extends Employee                     //virtual
{
public Manager(String name, String address, Scanner sc, int id, float salary) {
		super(name, address, sc, id, salary);
		// TODO Auto-generated constructor stub
	}
protected
    float bonus;
protected
    void accept_manager()
    {
       System.out.println("Enter bonus=");
       bonus=sc.nextFloat();
    }
     void display_manager()
    {
        System.out.println("Bonus="+this.bonus);
    }
public
   
    float getbonus()
    {
        return this.bonus;
    }
    void setbonus(float bonus)
    {
        this.bonus = bonus;
    }
    void accept()
    {
        Employee employee = new Employee(Address, Address, sc, id, bonus);
		employee.accept();
       System.out.println("Enter bonus");
       bonus=sc.nextFloat();
    }
    void display()
    {
        Employee employee = new Employee(Address, Address, sc, id, bonus);
		employee.display();
        System.out.println("Enter bonus"+this.bonus);
    }
    @Override
    	float CalculateSal() {
    		return super.CalculateSal();
    	}
}
// child class (or) derived class
class Salesman extends Manager                    //virtual
{
public Salesman(String name, String address, Scanner sc, int id, float salary) {
		super(name, address, sc, id, salary);
		// TODO Auto-generated constructor stub
	}
private
    float comm;
protected
    void accept_salesman()
    {
       System.out.println("Enter the commission"); 
       comm=sc.nextFloat();
       }
    void display_Salesman()
    {
        System.out.println("Commi="+this.comm);
    }

    float getcomm()
    {
        return this.comm;
    }
    void setcomm(float comm)
    {
        this.comm = comm;
    }
    void accept()
    {
        Employee employee = new Employee(Address, Address, sc, id, comm);
		employee.accept();
       System.out.println("Enter the commission");
       comm=sc.nextFloat();
    }
    void display()
    {
        Employee employee = new Employee(Address, Address, sc, id, comm);
		employee.display();
       System.out.println("Commssion"+this.comm);
    }
    @Override
    	float CalculateSal() {
    		return super.CalculateSal();
    	}
}
//indirect derived class
class SalesManager extends Salesman
{
	

	

public SalesManager(String name, String address, Scanner sc, int id, float salary) {
		super(name, address, sc, id, salary);
		// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	return "SalesManager [bonus=" + bonus + ", sc=" + sc + ", id=" + id + ", salary=" + salary + ", Name=" + Name
			+ ", Address=" + Address + "]";
}
@Override
	float CalculateSal() {
		return super.CalculateSal();
	}

    
   
}