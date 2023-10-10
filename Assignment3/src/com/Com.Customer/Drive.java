/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/
package Com;

import java.util.Scanner;

public class Drive 
{
	
		Scanner sc=new Scanner(System.in);
double Miles;
double GasPrice;
double AvgMiles;
double Parkfees;
int tollspday;
int people;
double Drivcost;
String car="Yes";

public void accept()
{
System.out.println("Enter total miles driven per day:\n");
Miles=sc.nextDouble();
System.out.println("Enter total price of gasoline:\n");
GasPrice=sc.nextDouble();
System.out.println("Enter total Average Miles per day:\n");
AvgMiles=sc.nextDouble();
System.out.println("Enter Parking fees:\n");
Parkfees=sc.nextInt();
System.out.println("Enter Toll per day:\n");
tollspday=sc.nextInt();
System.out.println("How many peoples are are in one car:\n ");
people=sc.nextInt();
System.out.println("Do you have car type Yes or No:\n ");
//car=sc.nextLine();


}
public void CalculateDrive()
{
	double CarMileage=25;
	double tollsPrice=150*tollspday;
	GasPrice=120/CarMileage;
	if(car=="Yes")
	{
	if(people<3) {
		System.out.println("please use Bike");
	
		Drivcost=tollsPrice+GasPrice+AvgMiles+Parkfees;
		System.out.println("Your daily driving cost is ="+Drivcost);
	}
	}
	
	
	
	else
	{
		System.out.println("Congratulation you are saving the Environment by doing car pooling");
	}
	
}
public static void main(String agrs[])
{
	Drive d=new Drive();
	d.accept();
	d.CalculateDrive();
}




}
