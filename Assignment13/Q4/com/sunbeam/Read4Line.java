package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Read4Line {

	public static void main(String[] args) {
		String s;
				try(FileReader fin = new FileReader("/home/sunbeam/Documents/Java/Assignment/Java/Assignment_15/Q3/String.txt")){
			try(BufferedReader br=new BufferedReader(fin)){
				while((s=br.readLine())!=null)
						{
					System.out.println(s);
						}
			}
		}
			catch (ClassCastException  e) {
				// do nothing
			}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
