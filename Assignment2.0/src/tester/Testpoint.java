package tester;

import com.app.geometry.Point2D1;


import java.util.Scanner;

public class Testpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept coordinates of two points from the user
        System.out.println("Enter x-coordinate for point 1:");
        double x1 = scanner.nextDouble();
        System.out.println("Enter y-coordinate for point 1:");
        double y1 = scanner.nextDouble();

        System.out.println("Enter x-coordinate for point 2:");
        double x2 = scanner.nextDouble();
        System.out.println("Enter y-coordinate for point 2:");
        double y2 = scanner.nextDouble();

        // Create two Point2D objects
        Point2D1 p1 = new Point2D1(x1, y1);
        Point2D1 p2 = new Point2D1(x2, y2);

        // Display point details
        System.out.println("Details of Point 1: " + p1.getDetails());
        System.out.println("Details of Point 2: " + p2.getDetails());

        // Check if points are located at the same position
        if (p1.isEqual(p2)) {
            System.out.println("Points p1 and p2 are located at the same position.");
        } else {
            // Calculate and display distance between p1 and p2
            double distance = p1.calculateDistance(p2);
            System.out.println("Points p1 and p2 are not located at the same position.");
            System.out.println("Distance between p1 and p2: " + distance);
        }
    }
}