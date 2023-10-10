package tester;

import java.util.Scanner;

public class TestPointArray1 {

	public static int Menu() {
		int choice;
		Scanner obj = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the 0 to exit");
		System.out.println("Enter 1. Display details of a specific point");
		System.out.println("Enter 2. Display x, y co-ordinates of all points");
		System.out.println("Enter 3. Find Distance between two points ");
		System.out.println("Enter Your Choice :- ");
		choice = obj.nextInt();
		System.out.println("-----------------------------------------------");

		return choice;
	}

public static void main(String args[])
{
	int choice;
	String s;
	double cal;
	Scanner obj=new Scanner(System.in);

	System.out.println("Enter how many no of points to plot");
	int n=obj.nextInt();
	Point2D  []p=new Point2D[n];
	for(int i=0;i<n;i++)
		p[i]=new Point2D();
	
	for(Point2D point:p)
	{
      point.accept();
	}
	
	while((choice=Menu())!=0)
	{
switch(choice)
{
case 1:
{
	System.out.println("Enter the Index of Point from 0 to "+n+" ;- ");
	int ip=obj.nextInt();
	if(ip>n)
		System.out.println("Invalid index , pls retry!!! ");
	s=p[ip].getDetails();
	System.out.println(s);
	}
break;
case 2:
	for(Point2D point:p)
	{
		s=point.getDetails();
	System.out.println(s);
	}
	break;
case 3:
{
	 System.out.print("Enter index of start point: ");
     int startIndex = obj.nextInt();
     System.out.print("Enter index of end point: ");
     int endIndex = obj.nextInt();
     if(p[startIndex].isEqual(p[endIndex]))
          {
    	 System.out.println("This two points are Equal");
    	 }
     else    {
    	 cal = p[startIndex].calculateDistance(p[endIndex]);
     System.out.println(cal);
     }
    
}
break;
default :
System.out.println("Enter the valid choice");

	}//while
			
}//main
}
}
