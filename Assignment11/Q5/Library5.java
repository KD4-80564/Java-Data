import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Book {
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
		return "Book [isbn=" + isbn + ", author Name=" + authorName + ", quantity=" + quantity + ", price=" + price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn code - ");
		this.isbn = sc.next();
		System.out.println("Enter Author Name - ");
		this.authorName = sc.next();
		System.out.println("Enter Quantity - ");
		this.quantity = sc.nextInt();
		System.out.println("Enter Price - ");
		this.price = sc.nextDouble();
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
public class Library5 {

	public static void main(String[] args) {
		Map<String,Book>map=new HashMap<>();
		Book b;
	int choice;
	do {
		System.out.println("----------------------------------------------");
		System.out.println("1. Add Book");
		System.out.println("2. Search Book");
		System.out.println("3. Exit");
		System.out.println("----------------------------------------------");
		choice=new Scanner(System.in).nextInt();
		
		switch(choice)
		{
		case 1:
		{b=new Book();
		b.accept();
		map.put(b.getIsbn(), b);
		}break;
		case 2:
		{String isbn;
			System.out.println("Enter the isbn");
			isbn=new Scanner(System.in).next();
			Book book=map.get(isbn);
			  if(book == null)
		        	System.out.println("Book Not found.");
		        else
		        	System.out.println("Book found " + book);
		}break;
		case 3:
		{
			System.out.println("Thank you for using our App");
		} break;
		default:
			System.out.println("Enter the valid choice");
		}
	}while(choice!=3);

	}

}
