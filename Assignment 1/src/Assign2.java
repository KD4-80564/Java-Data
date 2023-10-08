
/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.*/

import java.util.*;

class Assign2
{
	public static void main(String args[])
	{
	     double a;
		double b=7.00;
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter both numbers");
		a=sc.nextDouble();
		b=sc.nextDouble();
		 int compare = Double.compare(a, b);
			if(compare==0)
			{
				c=a+b/2;
				System.out.println("Average of 2 integers"+c);
			}
			else
			{
				System.out.println("Enter number is not double");
				
				
				
			}
		
	}
	}