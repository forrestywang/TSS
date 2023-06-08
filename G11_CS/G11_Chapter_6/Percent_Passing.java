package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Percent_Passing
// Create a Percent_Passing application that prompts the user for a set of scores and then calculates the percentage of
// scores above 70%. The user should have the option to enter as many scores as needed.

// Imports:
import java.util.*;

public class Percent_Passing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final int FLAG = -1;

        // Variables:
        int numberOfScores = 0;
        int passed = 0;
        int failed = 0;
        int score = 0;

        while (true) {
            System.out.println("Enter your test score or -1 to quit: ");
            score = myScanner.nextInt();

            if (score == FLAG) {
                break;
            }

            numberOfScores ++;

            if (score > 70) {passed ++;}
        }
        myScanner.close();

        // Calculations:
        double percentagePassed = passed * 100.0 / numberOfScores;

        // Output:
        System.out.printf("You passed %.2f%2s", percentagePassed, "% of your tests.");
    }
}