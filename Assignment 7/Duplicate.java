/*Q1. Declare two Arrays of type String. Find the duplicate values of an array of string values. (Hint:
use equals())*/




package assignment7;

import java.lang.reflect.Array;

public class Duplicate {

	public static void main(String[] args) {
	 String[]array= {"anil","patil","omkar","jadhv","omkar","anil"};
	 for(int i=0;i<array.length -1;i++) 
	 {
		 for(int j=i+1;j<array.length;j++)
	{
			 if(array[i].equals (array[j])&&(i !=j)) {
				 System.out.println("duplicate string="+ array[j]);
			 }
			  
			 
		 }
	 }

	}

}
