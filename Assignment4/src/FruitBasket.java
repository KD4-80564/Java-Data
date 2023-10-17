import java.util.Scanner;

public class FruitBasket {

	private static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("----------------------------------------------");
		System.out.println("Enter the choice from following");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Oange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight,taste of all fresh fruits,in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println("0. Exit");
		System.out.println("----------------------------------------------");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit basket size");
		int size = sc.nextInt();

		Fruit basket[] = new Fruit[size];

		int counter = 0;

		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				if (counter < size && basket[counter] == null) {
					basket[counter] = new Mango("Yellow",250,"Hapus");
					basket[counter].acceptFruit();
					counter++;
				} else {
					System.out.println("Basket is full");
				}

			}
				break;
			case 2: {
				if (counter < size && basket[counter] == null) {
					basket[counter] = new Orange("Orange",200,"Santra");
					basket[counter].acceptFruit();
					counter++;
				} else {
					System.out.println("Basket is full");
				}

			}
				break;

			case 3: {
				if (counter < size && basket[counter] == null) {
					basket[counter] = new Apple("Red",150,"Kashmiri Apple");
					counter++;
				} else {
					System.out.println("Basket is full");
				}

			}
				break;

			case 4: {
				for (Fruit f1 : basket) {
					System.out.println(f1.getName());
				}
			}
				break;

			case 5: {
				for (Fruit f1 : basket)
					System.out.println(f1.toString());
			}
				break;
				
			case 6:
			{
				for(Fruit f1: basket)
				{
					if(f1.isFresh()==false)
					{
						System.out.println(f1.taste());
					}
					else
					{
						System.out.println("Fruit is fresh");
					}
					
				}
			}
			break;
			
			case 7:
			{
				int num1;
				System.out.println("Enter serial number of fruit you entered which you want to mark as stale");
				num1=sc.nextInt();
				if((num1-1)<size)
				{
					basket[num1-1].setFresh(false);
				}
				else
				{
					System.out.println("Invalid Input!");
				}
				
			}
			break;
			
			case 8:
			{	String s;
				for(Fruit f1:basket)
				{
					if((s=f1.taste())!="Sour")
					{
						
						System.out.println("fruit is still fresh!");
					}
					else 
					{
						f1.setFresh(false);
					}
				}
				System.out.println("Successfully marked the fruits as Stale");
			}
			break;
			

			default: {
				System.out.println("Invalid choice!");
			}
			
			}

		}

	}
}
