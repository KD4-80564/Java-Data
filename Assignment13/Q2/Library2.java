


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Objects;
import java.util.Scanner;

class Book implements Serializable {
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

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn code - ");
		this.isbn = sc.next();
		System.out.println("Enter AuthorName - ");
		this.authorName = sc.next();
		System.out.println("Enter Quantity - ");
		this.quantity = sc.nextInt();
		System.out.println("Enter Price - ");
		this.price = sc.nextDouble();
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

	
	

}

public class Library2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Book> list= new ArrayList<>();
		ListIterator<Book> itr;
		Book b1;
int choice=0;
do {
	System.out.println("----------------------------------------------------------------");
	System.out.println("0.  Exit");
	System.out.println("1. Add new book in list.");
	System.out.println("2. Display all books in forward order using random access");
	System.out.println("3. Search a book with given isbn");
	System.out.println("4. Delete a book at given index.");
	System.out.println("5. Delete a book with given isbn.");
	System.out.println("6. Reverse the list");
	System.out.println("7. Save books in ﬁle ");
	System.out.println("8. load books from ﬁle");
	System.out.print("Enter your choice - ");
	choice = sc.nextInt();
	System.out.println("----------------------------------------------------------------------");
	
	switch(choice)
	{         // Add book
	case 1://If book not present, then add a new book (hint - contains())
		   //If book is present, increment its quantity.
	{	
		b1=new Book();
		b1.accept();
		if(list.contains(b1))
		{
			int index =list.indexOf(b1);
		         Book bk=list.get(index);
		         bk.setQuantity(bk.getQuantity()+1);
		}
		else
			list.add(b1);
			}
	System.out.println("Book added");
		break;
		
	case 2: //Display all books in forward order
	{
		itr = list.listIterator();
		while(itr.hasNext()) {
			b1 = itr.next();
			System.out.println(b1);
		}	
	}
	break;
	
case 3: // Search a book with given isbn
{
System.out.println("Enter The isbn ");
String isbn=sc.next();
Book key=new Book();
key.setIsbn(isbn);
System.out.println(key.getIsbn());
int index=list.indexOf(key);
if(index == -1)
	System.out.println("Book not found.");
else {
	System.out.println("Book Found at Index: " + index);
	b1 = list.get(index);
	System.out.println(b1);
}
	}	
break;
case 4://Delete a book at given index.");
{
	 System.out.print("Enter the index of the book to delete: ");
     int index = sc.nextInt();
     list.remove(index);
     System.out.println("Deleted");
}
break;
case 5: //  Delete a book with given isbn.
{
System.out.println("Enter The isbn ");
String isbn=sc.next();
Book key=new Book();
key.setIsbn(isbn);
int index=list.indexOf(key);
list.remove(index);
System.out.println("Deleted");

}
break;
case 6://Reverse the list
{
	Collections.reverse(list);
	for(int i=0;i<list.size();i++)
	{
		Book k=list.get(i);
		System.out.println(k);
	}
}
break;
case 7:
{
	try(FileOutputStream fout = new FileOutputStream("Books.bin")) {
		try(ObjectOutputStream dout = new ObjectOutputStream(fout)) {
		for(Book ele:list)
			dout.writeObject(ele);
			
		} // dout.close();
	} // fout.close();
	catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("Book saved.");
}
	break;
	
case 8:
{
	try(FileInputStream fin = new FileInputStream("Books.bin")) {
		try(ObjectInputStream din = new ObjectInputStream(fin)) {
			
			for(Book ele:list)
			{
			ele =(Book)din.readObject();	
			
				System.out.println(ele);
			}
		} // din.close();
	} // fin.close();
	catch (ClassCastException | ClassNotFoundException  e) {
		// do nothing
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}break;
	}
	
}while(choice !=0);
}//main
}//main class
