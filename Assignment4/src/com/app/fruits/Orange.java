import java.util.Scanner;

public class Orange extends Fruit {

	Scanner sc = new Scanner(System.in);

	public Orange() {
		super.setName("Orange");
	}

	public Orange(String colour, double weight, String name) {
		super(colour, weight, name);
		super.setName("Orange");
	}

	@Override
	public String taste() {
		return "Sour";
	}

	@Override
	public String toString() {
		return "Orange [colour=" + colour + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh
				+ ", taste()=" + this.taste() + "]";
	}

	@Override
	public void acceptFruit() {
		System.out.println("Enter details for Orange");
		super.acceptFruit();
	}

}
