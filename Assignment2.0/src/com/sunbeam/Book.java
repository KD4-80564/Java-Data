/*4. Store book details in a library in a list -- ArrayList.

Book details: isbn(string), price(double), authorName(string), quantity(int)
Write a menu driven (do-while + switch-case) program to
1. Add new book in list.
2. Display all books in forward order.
3. Delete at book given index -- list.remove(index);
4. Check if book with given isbn is in list or not
5. Delete all books in list
6. Display number of books in list
7. Sort all books by price in desc order -- list.sort();*/

/*package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
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
	isbn=sc.toString();
	price=sc.nextDouble();
	AuthorName=sc.toString();
	Quanty=sc.nextInt();
	
}
 



public static void main(String args[])
{
	List<Book> arr = new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	int choice =0;
	while(true)
	{
	System.out.println("--------------Enter your Choice--------------");
	System.out.println("1:To store the book in Library");
	System.out.println("2:Display all books");
	System.out.println("3:Delete at book given index");
	System.out.println("4:Check if book with given isbn is in list or not");
	System.out.println("5:Delete all books in list");
	System.out.println("6:Display number of books in list");
	System.out.println("7:Sort all books by price in Desending orders");
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
		
	case 3: {
		
		System.out.println("Enter index to delete book ");
		int index = sc.nextInt();
		arr.remove(index);
		// optional
//		for (int i = 0; i < arr.size(); i++) {
//			if (index == i)
//				arr.remove(i);
//		}
	}
		break;
	case 4: {
		Book key = new Book();
		key.setIsbn("123");
		if (arr.contains(key))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
		break;

	case 5: {
		arr.clear();
		// Optional
//		for (int i = 0; i < arr.size(); i++) {
//			arr.remove(i);
//		}
	}
		break;
	case 6: {
		System.out.println(arr.size());
		for (Book ele : arr) {
			System.out.println(ele);
		}
	}
		break;
	case 7: {
		class BookPriceSort implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		BookPriceSort comparator = new BookPriceSort();
		arr.sort(comparator);
	}
		break;
	default:
		System.out.println("Invalid Input");
	}
}
}

}*/
