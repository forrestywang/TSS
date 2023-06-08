package G11_Chapter_8;

// @author Forrest Wang
// May 5, 2021
//
// High_Low
// In the Hi-Lo game, the player picks either Hi or Lo. A random number between and including 1-13 is picked. If the
// player picked Lo, they win if the number generated is between and including 1-6. If the player picked Hi, they win if
// the number generated is between and including 8-13. The player loses if the number generated is in the opposite
// range. The player does not win or lose if the number picked is 7. Given a seed and the range the player picked,
// determine if they win the game. The random number should be generated using the java.util.Random class.

// Imports:
import java.util.*;

public class High_Low {

    /**
     * Pre-condition: Requires the value of guess, and secretNumber.
     * Post-condition: Should output whether the user guessed correctly or not.
     */
    public static void getResult(String guess, int secretNumber) {

        // Output:
        if (guess.equals("Hi") && secretNumber > 7) {System.out.println("You won.");}

        else if (guess.equals("Lo") && secretNumber < 7) {System.out.println("You lost.");}

        else {System.out.println("You tied.");}
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should store the user's guess, generate a random number between 1 and 13, and execute the getResult() method.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a seed: ");
        long seed = myScanner.nextLong();
        System.out.println("Enter Hi, or Lo: ");
        String guess = myScanner.next();
        myScanner.close();

        Random rng = new Random(seed);

        int secretNumber = rng.nextInt(13) + 1;

        // Output:
        getResult(guess, secretNumber);
    }
}