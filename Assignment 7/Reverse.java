/*Q2. Write a java program to reverse a String*/



package assignment7;
import java.lang.*;
import java.io.*;


public class Reverse {

	public static void main(String[] args) {
		 String a="ANILJATALE";
		 char[]b=a.toCharArray();
		 for(int i=a.length()-1;i>=0;i--) {
			 System.out.println("reverese array="+b[i]);
			 
		 }

	}

}
