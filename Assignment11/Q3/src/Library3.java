

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	String isbn;
	String authorName;
	int quantity;
	double price;

	public Book() {

	}

	public Book(String isbn, String authorName, int quantity, double price) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorName=" + authorName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book ob) {
		int diff=this.isbn.compareTo(ob.isbn);
		return diff;
	}
	
}

public class Library3 {

	public static void main(String[] args) {
		Set<Book> b=new TreeSet<>();
		
		b.add(new Book("3","Sahil",3,150));
		b.add(new Book("2","Akash",2,10));
		b.add(new Book("7","Sriniwas",5,3));
		b.add(new Book("1","Adtiya",3,150));
		b.add(new Book("5","Krishna",8,60));
		b.add(new Book("2","Ayush",3,1));
		
		Iterator<Book> itr=b.iterator();
		while(itr.hasNext())
		{
		  Book ele=itr.next();
		System.out.println(ele);
		}
		
	}//main
}//Library 
/*
In above assignment use TreeSet instead of LinkedHashSet.
Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?
*
*
*Answer :- if duplicate is added then first inserted element is added
*
*/

