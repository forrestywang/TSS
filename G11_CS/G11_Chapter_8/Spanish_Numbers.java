package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// Spanish_Numbers
// Create a Spanish_Numbers application that displays numbers 1 through 10 in Spanish. A method with an int parameter
// should display the Spanish word for the number passed. A loop structure in the main() method should call the method
// ten times.

// Imports:
import java.util.*;

public class Spanish_Numbers {

    /**
     * Pre-condition: Requires that the number entered should range from 1 to 10.
     * Post-condition: Should output the corresponding number in spanish.
     */
    public static void spanishNumber() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a number from 1 to 10: ");
        byte number = myScanner.nextByte();

        myScanner.close();

        // Calculations:
        switch (number) {
            case 1 -> System.out.println("One -> Uno");
            case 2 -> System.out.println("Two -> Dos");
            case 3 -> System.out.println("Three -> Tres");
            case 4 -> System.out.println("Four -> Cuatro");
            case 5 -> System.out.println("Five -> Cinco");
            case 6 -> System.out.println("Six -> Seis");
            case 7 -> System.out.println("Seven -> Siete");
            case 8 -> System.out.println("Eight -> Ocho");
            case 9 -> System.out.println("Nine -> Nueve");
            case 10 -> System.out.println("Ten -> Diez");
        }
    }

    /**
     * Pre-condition: Requires that i < 10.
     * Post-condition: Should execute the method "spanishNumber()".
     */
    public static void main(String[] args) {
        // Output:
        for (byte i = 0; i < 10; i++) {spanishNumber();}
    }
}