package tester;

import java.util.Scanner;

public class Point2D {
	double x,y;
	Scanner obj=new Scanner(System.in);

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void accept()
	{
		System.out.println("------------------------------------------------------");
		System.out.print("Enter the X-axis cordinates :- ");
		this.x=obj.nextDouble();
		System.out.print("Enter the Y-axis cordinates  :-");
		this.y=obj.nextDouble();
		System.out.println("------------------------------------------------------");
		
	}
	public String getDetails()
	{
		String a="X-axis :- "+x+" "+"Y-axis :- "+y;
		return a;
	}
public boolean isEqual(Point2D otherPoint)
{
	return this.x==otherPoint.x && this.y==otherPoint.y;
	
	
}
public double calculateDistance(Point2D otherPoint)
{
	  double X = this.x - otherPoint.x;
      double Y = this.y - otherPoint.y;
      return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
}
}
