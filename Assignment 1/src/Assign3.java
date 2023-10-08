import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int d = 0, so = 0, id = 0, bi = 0, fi = 0, a = 0;

        int choice;
        while ((choice = Menu(sc)) != 0) 
        {
            switch (choice) 
            {
                case 1:
                    System.out.println("You ordered a Dosa = 50rs");
                    a = sc.nextInt();
                    d += (50 * a);
                    break;

                case 2:
                    System.out.println("You ordered a Samosa");
                    a = sc.nextInt();
                    so += (30 * a);
                    break;

                case 3:
                    System.out.println("You ordered an Idli");
                    a = sc.nextInt();
                    id += (30 * a);
                    break;

                case 4:
                    System.out.println("You ordered a Biryani");
                    a = sc.nextInt();
                    bi += (70 * a);
                    break;
                case 5:
                	  fi = d + so + id + bi;
                      System.out.println("Your final bill: " + fi);
                      break;
                   

                default:
                    System.out.println("Invalid choice");
            }
        }

        
    }

    public static int Menu(Scanner sc) 
    {
        System.out.println("Enter 0 to Exit");
        System.out.println("Enter 1 to order Dosa");
        System.out.println("Enter 2 to order Samosa");
        System.out.println("Enter 3 to order Idli");
        System.out.println("Enter 4 to order Mullaji's special Biryani AKA the original GOAT");
        System.out.println("Enter 5 to generate Bill");

        return sc.nextInt();
    }
}
