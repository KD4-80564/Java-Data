package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book 
{
	Scanner sc=new Scanner(System.in);
private String isbn;
private double price;
private String AuthorName;
private int Quanty;

public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String isbn, double price, String authorName, int quanty) {
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
	List<Book> arr = new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	int choice =0;
	while(true)
	{
	System.out.println("--------------Enter your Choice--------------");
	System.out.println("1:To store the book in Library");
	System.out.println("2:Display all books");
	System.out.println("3:Save Book in file");
	System.out.println("4:Load books from file");
	
	choice=sc.nextInt();
    
	
	switch(choice)
	{
	case 1: {
		Book b = new Book();
		b.accept();
		arr.add(b);
		
	}
	break;
		
	case 2: {
		for (Book ele : arr) {
			System.out.println(" Book = " + ele);
		}
	}
		
	
		break;
	case 3: {
		try(FileOutputStream fout = new FileOutputStream("Book.bin")) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for(Book m : arr) {
					dout.writeUTF(m.getIsbn());
					dout.writeDouble(m.getPrice());
					dout.writeDouble(m.getPrice());
					dout.writeUTF(m.getAuthorName());
					
				}
			} // dout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Movies saved.");
	}
	
		break;

	case 4: {
		try(FileInputStream fin = new FileInputStream("Book.bin")) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					Book m = new Book();
					m.setIsbn( din.readUTF() );
					m.setPrice( din.readDouble() );
					m.setAuthorName( din.readUTF() );
					m.setQuanty( din.readInt() );
					System.out.println(m);
				}
			} // din.close();
		} // fin.close();
		catch (EOFException e) {
			// do nothing
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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


