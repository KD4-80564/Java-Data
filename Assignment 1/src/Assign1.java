/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/


import java.util.*;

class Assign1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
  int a;
  System.out.println("Enter number");
  a=sc.nextInt();
 
  System.out.println(Integer.toBinaryString(a));
  System.out.println(Integer.toOctalString(a));
  System.out.println(Integer.toHexString(a));
  
	sc.close();
	}
	}