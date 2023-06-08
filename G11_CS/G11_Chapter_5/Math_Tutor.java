package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Math_Tutor
// Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an
// operator (*, +, –, /), and then prompts the user for an answer. The application should check the answer, display a
// message, and the correct answer, if necessary.

// Imports:
import java.util.*;

public class Math_Tutor {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        // Variables:
        int number1 = rng.nextInt(10) + 1;
        int number2 = rng.nextInt(10) + 1;
        int operationNumber = rng.nextInt(4) + 1;
        int answer = 0;
        int userInput = 0;

        // Output 1:
        switch (operationNumber) {
            case 1 -> {
                System.out.println("What is " + number1 + " + " + number2 + "?");
                answer = number1 + number2;
                userInput = myScanner.nextInt();
            }
            case 2 -> {
                System.out.println("What is " + number1 + " - " + number2 + "?");
                answer = number1 - number2;
                userInput = myScanner.nextInt();
            }
            case 3 -> {
                System.out.println("What is " + number1 + " * " + number2 + "?");
                answer = number1 * number2;
                userInput = myScanner.nextInt();
            }
            case 4 -> {
                System.out.println("What is " + number1 + " / " + number2 + "?");
                answer = number1 / number2;
                userInput = myScanner.nextInt();
            }
        }
        myScanner.close();

        // Output 2:
        if (userInput == answer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect.");
        }
    }
}