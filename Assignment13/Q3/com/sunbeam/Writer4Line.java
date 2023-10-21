package com.sunbeam;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.util.Scanner;

public class Writer4Line {

	public static void main(String[] args) {
		String s;
				try(FileWriter fout = new FileWriter("String.txt")){
			try(BufferedWriter bw=new BufferedWriter(fout)){
				for(int i=1;i<=4;i++)
				{
					System.out.println("Enter "+i+" Number Line \n");
		s=new Scanner(System.in).nextLine();
		bw.write(s);
		bw.newLine();
				}
			}
		}
			catch (ClassCastException  e) {
				// do nothing
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("4 Lines Added");

	}

}
