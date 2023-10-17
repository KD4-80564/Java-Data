import java.util.Scanner;

public class Apple extends Fruit {

	Scanner sc = new Scanner(System.in);

	public Apple() {
		super.setName("Apple");

	}

	public Apple(String colour, double weight, String name) {
		super(colour, weight, name);
		super.setName("Apple");

	}

	@Override
	public String taste() {
		return "Sweet n sour";
	}

	@Override
	public String toString() {
		return "Apple [colour=" + this.colour + ", weight=" + this.weight + ", name=" + this.name + ", isFresh=" + this.isFresh
				+ ", taste()=" + this.taste() + "]";
	}

	@Override
	public void acceptFruit() {
		System.out.println("Enter details for Apple");
		super.acceptFruit();
	}

}
