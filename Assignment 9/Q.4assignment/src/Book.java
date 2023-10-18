 
import java.util.*;

class Book {
	 
	 String isbn;
	 String title;
	 String author;
	 int quantity;
	 double pricce;
	  
	public Book() {
		super();
	}
	public Book(String isbn, String title, String author, int quantity, double pricce) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.pricce = pricce;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricce() {
		return pricce;
	}
	public void setPricce(double pricce) {
		this.pricce = pricce;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", pricce="
				+ pricce + "]";
	}
	 
	
	
}
