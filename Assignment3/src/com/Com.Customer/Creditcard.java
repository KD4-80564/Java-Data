package Com.Customer;

import java.util.Scanner;

public class Creditcard{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Input customer information
            System.out.print("Enter account number (or -1 to exit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits this month: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate the new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Check if the new balance exceeds the credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("New balance: " + newBalance);
            }
        }

        input.close();
    }
}
