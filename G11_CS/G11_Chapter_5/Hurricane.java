package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Hurricane
// The Saffir-Simpson Hurricane Scale provides a rating (a category) depending on the current intensity of a hurricane.
// Create a Hurricane application that displays the wind speed for the hurricane category entered by the user. Display
// the speed in miles per hour (mph), knots (kts), and kilometers per hour (km/hr).

// Imports:
import java.util.*;

public class Hurricane {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the hurricane category rating (1 - 5): ");
        int categoryRating = myScanner.nextInt();
        myScanner.close();

        // Output:
        switch (categoryRating) {
            case 1 -> System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr.");
            case 2 -> System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr.");
            case 3 -> System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr.");
            case 4 -> System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr.");
            case 5 -> System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr.");
        }
    }
}