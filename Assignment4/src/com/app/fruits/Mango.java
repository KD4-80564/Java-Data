import java.util.Scanner;

public class Mango extends Fruit {
	Scanner sc = new Scanner(System.in);

	public Mango() {
		super.setName("Mango");
	}

	public Mango(String colour, double weight, String name) {
		super(colour, weight, name);
		super.setName("Mango");

	}

	@Override
	public String taste() {
		return "Sweet";
	}

	@Override
	public String toString() {
		return "Mango [colour=" + colour + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh
				+ ", taste()=" + this.taste() + "]";
	}

	@Override
	public void acceptFruit() {
		System.out.println("Enter details for Mango");
		super.acceptFruit();
	}

}
