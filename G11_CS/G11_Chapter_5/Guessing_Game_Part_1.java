package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Guessing_Game_Part_1
// Create a Guessing_Game application that follows this algorithm: determine a secret number between 1 and 20, prompt
// the user for a number between 1 and 20, compare the player's number to the secret number, display the secret number
// and the player's number, if the player's number matches the secret number, then display "You won!", otherwise display
// "Better luck next time.".

// Imports:
import java.util.*;

public class Guessing_Game_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        // Variables:
        System.out.println("Enter a number between 1 and 20: ");
        int playersNumber = myScanner.nextInt();
        myScanner.close();

        int secretNumber = rng.nextInt(20) + 1;

        // Output:
        System.out.println("Secret number: " + secretNumber);
        System.out.println("Your number: " + playersNumber);

        if (playersNumber == secretNumber) {
            System.out.println("You won!");
        }
        else {
            System.out.println("Better luck next time.");
        }
    }
}