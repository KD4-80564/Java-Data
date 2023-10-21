package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inputline 
{
	public static void main(String args[]) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
FileWriter fw=new FileWriter("Hi.txt");
try  {
	try (BufferedWriter bw = new BufferedWriter(fw)) {
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter text");
			String line=sc.nextLine();
			bw.write(line);
			bw.newLine();
			
		}
	}
}
finally {
	
}
}
}