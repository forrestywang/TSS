package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Guessing_Game_Part_2
// Modify the Guessing_Game_Part_1 application to allow for as many guesses as needed.

// Imports:
import java.util.*;

public class Guessing_Game_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        // Variables:
        int secretNumber = rng.nextInt(20) + 1;
        int playersNumber = 0;

        // Output:
        while (playersNumber != secretNumber) {
            System.out.println("Enter a number between 1 and 20: ");
            playersNumber = myScanner.nextInt();

            if (playersNumber == secretNumber) {System.out.println("You won!");}
            else {System.out.println("Try again.");}
        }
        myScanner.close();
    }
}