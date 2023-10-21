package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread
{
	public static void main(String args[]) 
	{

FileReader fr = null;
try {
	fr = new FileReader("H1.txt1");
     } 
catch (FileNotFoundException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try(BufferedReader br=new BufferedReader(fr))
{

String line;

while((line=br.readLine())!=null)
{
	System.out.println(line);
}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
