import java.util.Scanner;

/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/

public class EmpAssign
{
	Scanner sc=new Scanner(System.in);
String Fname;
String Lname;
double Sal;
public EmpAssign()
{
	this.Sal=0;
}
public EmpAssign(String Fname,String Lname,double Sal)
{
	this.Fname=Fname;
	this.Lname=Lname;
	this.Sal=Sal;
}
public String getFname()
{
	return Fname;
}
public void setFname(String Fname)
{
	this.Fname=Fname;
}
public String getLname()
{
	return Fname;
}
public void setLname(String Lname)
{
	this.Lname=Lname;
}
public double getSal()
{
	return Sal;
}
public void setSal(double Lname)
{
	this.Sal=Sal;
}
public void acceptEmp()
{
	
	System.out.println("Enter first name of Employee:\n");
	Fname=sc.next();
	System.out.println("Enter Last name of Employee:\n");
	Lname=sc.next();
	System.out.println("Enter Employee Salary\n");
	Sal=sc.nextDouble();
	
}
public void displayEmp() {
	System.out.println("First name:" + this.Fname);
	System.out.println("Last name:" + this.Lname);
	
	System.out.println("Employee Salry="+this.Sal);
	Sal=Sal+Sal*0.10;
	System.out.println("salary after increment="+this.Sal);
	
}
public void CalSal()
{
	if(this.Sal<0)
	{
		System.out.println("Your Sal is lower than zero 0 please re entered your Sal \n");
		
		
	}
	else
		this.Sal=sc.nextDouble();
	this.Sal+=12*0.10;
	System.out.println("Emp Salary is :\n"+this.Sal);
	
}

}
