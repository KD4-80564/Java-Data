/*2. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use ObjectOutputStream
and ObjectInputStream.*/
package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book2
{
	Scanner sc=new Scanner(System.in);
private String isbn;
private double price;
private String AuthorName;
private int Quanty;

public Book2() {
	// TODO Auto-generated constructor stub
}
public Book2(String isbn, double price, String authorName, int quanty) {
	super();
	this.isbn = isbn;
	this.price = price;
	AuthorName = authorName;
	Quanty = quanty;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
public int getQuanty() {
	return Quanty;
}
public void setQuanty(int quanty) {
	Quanty = quanty;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", AuthorName=" + AuthorName + ", Quanty=" + Quanty + "]";
}
public void accept()
{
	System.out.println("Enter isbn,price,authorName,Quantity");
	isbn=sc.next();
	price=sc.nextDouble();
	AuthorName=sc.next();
	Quanty=sc.nextInt();
	
}
 



public static void main(String args[])
{
	readMovies();
	List<Book2> arr = new ArrayList<Book2>();
	
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int choice =0;
	while(true)
	{
	System.out.println("--------------Enter your Choice--------------");
	System.out.println("1:To store the book in Library");
	System.out.println("2:Display all books");
	System.out.println("3:Read file");
	System.out.println("4:Write");
	
	choice=sc.nextInt();
    
	
	switch(choice)
	{
	case 1: {
		Book2 b = new Book2();
		b.accept();
		arr.add(b);
		
	}
	break;
		
	case 2: {
		for (Book2 ele : arr) {
			System.out.println(" Book = " + ele);
		}
	}
		
	
		break;
	case 3: {
		List<Book2> list;
		try(FileInputStream fin = new FileInputStream("Bookss2.bin")) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				list = (List<Book2>) oin.readObject();
				list.forEach(m -> System.out.println(m));
			}
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		break;

	case 4: {
		try(FileOutputStream fout = new FileOutputStream("Bookss2.db")) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(arr);
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Movies saved.");
	}
	break;
	
	
		
	default:
		System.out.println("Invalid Input");
	}
}
}
private static void readMovies() {
	// TODO Auto-generated method stub
	
}
}



