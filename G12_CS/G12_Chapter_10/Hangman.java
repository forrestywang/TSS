package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Hangman
// Create a Hangman application that simulates a Hangman game.

// Import(s):
import java.util.*;

public class Hangman {
    // Field(s):
    private static String answer = null;
    private static StringBuffer wordGuess = new StringBuffer();
    private static StringBuffer triedLetters = new StringBuffer();

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should return the answer to the Hangman game.
     */
    public static String getWord() {
        return answer;
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should return the variable wordGuess.
     */
    public static StringBuffer getGuessed() {
        return wordGuess;
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should return the variable triedLetters.
     */
    public static StringBuffer getTried() {
        return triedLetters;
    }

    /**
     * Pre-condition: Requires the value of the variable letterGuessed.
     * Post-condition: Should return 0 if the letter has been tried before, -1 if it is not in the word, and 1 if it is
     * in the word.
     */
    public static byte tryLetter(String letterGuessed) {
        // Variable(s):
        int index = answer.indexOf(letterGuessed);

        // Calculations:
        if (index != -1){
            while (index >= 0){
                wordGuess = wordGuess.replace(index, index + 1, letterGuessed);
                index = answer.indexOf(letterGuessed, index + 1);
            }

            triedLetters.append(letterGuessed);
            return 1;
        }

        else if (triedLetters.indexOf(letterGuessed) != -1) {return 0;}

        else {
            triedLetters.append(letterGuessed);
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter the answer to the Hangman game: ");
        answer = myScanner.nextLine();
        String letterGuessed;
        byte result;
        int attempts = 0;
        boolean finished = false;

        // Calculations:
        wordGuess.append("_".repeat(answer.length())); // IntelliJ suggested this notation.

        while (!finished) {
            System.out.println("------------------------------");
            System.out.println("Tried letters: " + getTried());
            System.out.println("Attempts: " + attempts);
            System.out.println();
            System.out.println("Enter your next guess: ");

            letterGuessed = myScanner.nextLine();

            // Game Rules:
            if (letterGuessed.length() != 1) {System.out.println("Invalid input.");}

            else {
                result = tryLetter(letterGuessed);

                switch (result) {
                    case 1 -> System.out.println("\"" + letterGuessed + "\" is in the word.");
                    case -1 -> System.out.println("\"" + letterGuessed + "\" is not in the word.");
                    default -> System.out.println("Already tried.");
                }
            }

            attempts++;

            // Check if game is finished;
            if (getGuessed().indexOf("_") == -1) {
                System.out.println("You guessed the word \"" + getWord() + "\" in " + attempts + " attempts.");
                finished = true;
            }
        }
    }
}