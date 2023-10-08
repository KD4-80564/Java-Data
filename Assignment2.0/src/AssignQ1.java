import java.util.Scanner;

/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.8*/

class AssignQ1 {
	String Pnum;
	String Pdiscrip;
	int Qnty;
	double Price;

	public AssignQ1() {
		this.Qnty = 0;
		this.Price = 0;
	}

	public AssignQ1(String Pnum, String Pdiscrip, int Qnty, double Price) {
		this.Pnum = Pnum;
		this.Pdiscrip = Pdiscrip;
		this.Qnty = Qnty;
		this.Price = Price;
	}

	public String getPNum() {
		return Pnum;
	}

	public void getPnum(String Pnum) {
		this.Pnum = Pnum;
	}

	public String getPdiscrip() {
		return Pdiscrip;
	}

	public void getpdiscrip(String Pdiscrip) {
		this.Pdiscrip = Pdiscrip;
	}

	public int getQnty() {
		return Qnty;
	}

	public void getQnty(int Qnty) {
		this.Qnty = Qnty;
	}

	public double getPrice() {
		return Price;
	}

	public void getPrice(double Price) {
		this.Price = Price;
	}

	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Part number:\n");
		Pnum = sc.next();
		System.out.println("Enter Part Discription:\n");
		Pdiscrip = sc.next();
		System.out.println("Enter Quantity:\n");
		Qnty = sc.nextInt();
		System.out.println("Enter the price:\n");
		Price = sc.nextInt();

	}

	public void displayInvoice() {
		System.out.println("Part number=" + Pnum);
		System.out.println("Part Discription=" + Pdiscrip);
		System.out.println("Part Quantity=" + Qnty);
		System.out.println("Part number =" + Pnum);
	}

	public void CalCulation() {
		double d;
		d = Price;
		this.Price = (int) (Price * Qnty);
		System.out.println("The total price of an Items are=" + this.Price);

	}

}
