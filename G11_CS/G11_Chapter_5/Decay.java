package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Decay
// Create a Decay application that prompts the user to select one of the three choices, and based on the selected option
// prompts the user to enter the appropriate known information. For example, a radioactive mass of 200 grams will reduce
// to 100 grams in 10 years. Based on this information, the half-life is calculated to be –0.06931.

// Imports:
import java.util.*;

public class Decay {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // User Decision:
        System.out.println("1. Calculate the final mass (grams).");
        System.out.println("2. Calculate the initial mass (grams).");
        System.out.println("3. Calculate the half-life.");
        int decision = myScanner.nextInt();

        // Switch Statement:
        switch (decision) {
            case 1 -> {
                // Variables:
                System.out.println("Enter the initial mass (grams): ");
                float initialMass = myScanner.nextFloat();
                System.out.println("Enter the half-life: ");
                float halfLife = myScanner.nextFloat();
                System.out.println("Enter the time (years): ");
                float time = myScanner.nextFloat();

                // Calculations:
                float finalMass = (float) (initialMass * Math.exp(- halfLife * time));

                // Output:
                System.out.println("The final mass is: " + finalMass + " grams");
            }
            case 2 -> {
                // Variables:
                System.out.println("Enter the final mass (grams): ");
                float finalMass = myScanner.nextFloat();
                System.out.println("Enter the half-life: ");
                float halfLife = myScanner.nextFloat();
                System.out.println("Enter the time (years): ");
                float time = myScanner.nextFloat();

                // Calculations:
                float initialMass = (float) (finalMass / Math.exp(- halfLife * time));

                // Output:
                System.out.println("The initial mass is: " + initialMass + " grams");
            }
            case 3 -> {
                // Variables:
                System.out.println("Enter the initial mass (grams): ");
                float initialMass = myScanner.nextFloat();
                System.out.println("Enter the final mass (grams): ");
                float finalMass = myScanner.nextFloat();
                System.out.println("Enter the time (years): ");
                float time = myScanner.nextFloat();

                // Calculations:
                float halfLife = (float) (Math.log(finalMass / initialMass) / time);

                // Output:
                System.out.println("The half-life is: " + halfLife);
            }
        }
        myScanner.close();
    }
}