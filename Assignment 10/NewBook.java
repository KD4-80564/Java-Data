/*1. Store book details in a library in a list -- ArrayList.
Book details: isbn(string), price(double), authorName(string), quantity(int)
Write a menu driven program to
1. Add new book in List
If book not present, then add a new book (hint - contains())
If book is present, increment its quantity.
2. Display all books in forward order using random access
3. Search a book with given isbn (hint - indexOf())
4. Delete a book at given index.
5. Delete a book with given isbn.
6. Reverse the list (hint - Collections.reverseList())*/

package com.sunbeam;
	import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
	import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

	class NewBook 
	{
		private static int count;
		Scanner sc=new Scanner(System.in);
	private String isbn;
	private double price;
	private String AuthorName;
	private int Quanty;

	public NewBook() {
		// TODO Auto-generated constructor stub
	}
	public NewBook(String isbn, double price, String authorName, int quanty) {
		super();
		this.isbn = isbn;
		this.price = price;
		AuthorName = authorName;
		Quanty = quanty;
		
	}
	
	public  String getIsbn() {
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
		System.out.println("Enter isbn");
		isbn=sc.next();
		System.out.println("Enter price");
		price=sc.nextDouble();
		System.out.println("Enter Author Name");
		AuthorName=sc.next();
		System.out.println("Enter Quantity");
		Quanty=sc.nextInt();
		
	}
	
	public static void main(String args[])
	{
		List<NewBook> arr = new ArrayList<NewBook>();
		
		NewBook b = null;
		ListIterator<NewBook> itr;
		Scanner sc=new Scanner(System.in);
		int choice =0;
		while(true)
		{
		System.out.println("--------------Enter your Choice--------------");
		System.out.println("1:To add the new book in List");
		System.out.println("2:Display all books");
		System.out.println("3:Sedarch a book in given isbn");
		System.out.println("4:delete a book at given index");
		System.out.println("5:Delete a book on given index");
		System.out.println("6:Reverse the list");
	
		choice=sc.nextInt();
	    
		
		switch(choice)
		{
		case 1: 
			 b = new NewBook();
			b.accept();
			
			NewBook key = new NewBook();
			key.setIsbn(b.getIsbn());
			if(b.contains(key))
				arr.add(b);
			else
				
				  count = b.getQuanty();
			b.setQuanty(count+1);
			
			
		
		break;
			
		case 2: 
			System.out.println("Forward display: ");
			for(int i=0;i<arr.size();i++)
			{
				b=arr.get(i);
				
			}
			System.out.println(b);
			
		break;
		
			
		case 3: // Search
			System.out.print("Enter isbn to find book: ");
			String isbn = sc.next();
			NewBook b1=new NewBook();
			b1.setIsbn(isbn);
			int index=arr.indexOf(b1);
			if(index==-1)
			{
				System.out.println("Book not found");
			}
			else
				System.out.println("Book found at this index"+index);
			b1=arr.get(index);
			System.out.println(b1);
			break;

		case 4: 
			System.out.println("Enter the index to delete");
			 index=sc.nextInt();
			arr.remove(index);
			System.out.println("Book has deleted");
			
		
			break;

		case 5: 
			System.out.println("Enter isbn to delete book");
			NewBook b2= new NewBook();
			isbn=sc.next();
			b2.setIsbn(isbn);
			 index = arr.indexOf(b2);
			
			break;
			
		case 6:{
			Collections.reverse(arr);
			System.out.println("Reveresed List: " + arr);
		}
			default:
				System.out.println("Wrong choice");
	}
		}
	}
	private boolean contains(NewBook key) {
		// TODO Auto-generated method stub
		return false;
	}
	}
	 


