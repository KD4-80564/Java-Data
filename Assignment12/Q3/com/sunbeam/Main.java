package com.sunbeam;

import java.util.Scanner;

interface Arithmetic {
	double calc(double n1,double n2);
}

public class Main{

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
			System.out.println("Result: "+result);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice;
double num1,num2;
do {
	 System.out.println("Menu:");
     System.out.println("1. Addition");
     System.out.println("2. Subtraction");
     System.out.println("3. Multiplication");
     System.out.println("4. Division");
     System.out.println("0. Exit");
     System.out.print("Enter your choice: ");
     choice =new Scanner(System.in).nextInt();
     
     System.out.print("Enter the first number: ");
     num1 = new Scanner(System.in).nextDouble();
     System.out.print("Enter the second number: ");
     num2 = new Scanner(System.in).nextDouble();
	 Arithmetic op=null;
     switch(choice)
     {
     case 1://Addition
     {
    	op=(a,b)-> a+b;
    	 calculate(num1, num2, op);
     }
     
     break;
     case 2://sub
     {
    	op=(a,b)-> a-b;
    	 calculate(num1, num2, op);
     }
     break;
     case 3://mul
     {
    	op=(a,b)-> a*b;
    	 calculate(num1, num2, op);
     }
     break;
     case 4://div
     {
    	op=(a,b)-> a/b;
    	 calculate(num1, num2, op);
     }
     break;
     
     default:
    	 System.out.println("Enter a vaild choice");
     }
    
}while(choice!=0);
	}

}
