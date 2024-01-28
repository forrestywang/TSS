package G11_Chapter_4;

// @author Forrest Wang
// March 15th, 2021
//
// Distance_Part_2
// Program an application that asks for the user's name and the length of each race segment, and outputs the user's name
// and how much they have to run.

// Imports:
import java.util.*;

public class Distance_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Enter how long you want the first race segment to be (kilometres): ");
        double segment1 = myScanner.nextDouble();
        System.out.println("Enter how long you want the second race segment to be (kilometres): ");
        double segment2 = myScanner.nextDouble();
        System.out.println("Enter how long you want the third race segment to be (kilometres): ");
        double segment3 = myScanner.nextDouble();
        myScanner.close();

        // Calculations:
        double totalDistance = segment1 + segment2 + segment3;

        // Output:
        System.out.println(name + " has to run " + totalDistance + " kilometres.");
    }
}