import java.util.Scanner;

public class Fruit {

	Scanner sc=new Scanner(System.in);
	
	String colour;
	double weight;
	String name;
	boolean isFresh=true;
	public Fruit(String colour, double weight, String name) {
	
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		
	}
	public Fruit() {
		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	public String taste()
	{
		return "no specific taste";
	}
	
	public void acceptFruit()
	{
		System.out.println("Enter Colour: ");
		colour=sc.next();
		System.out.println("Enter weight of the fruit: ");
		weight=sc.nextDouble();
		System.out.println("Enter Name of the fruit");
		name=sc.next();
	}

	
}
