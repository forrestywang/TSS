package G11_Chapter_4;

// @author Forrest Wang
// March 17th, 2021
//
// Mars_Election
// The elections established by the Mars colony are held every 4 years. On this planet, elections determine the number
// of seats won by each party. The seats won are proportional to the percentage of votes they received, rounded down to
// the nearest seat. The seats that remain from rounding are distributed to the parties that won the largest fraction of
// a seat. The party with the biggest fractional seat is given one first, then the second and so on. This is repeated
// until there are no seats left. Using this process, determine how many seats each party would receive.

// Imports:
import java.util.*;

public class Mars_Election {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Note: the total number of seats cannot exceed 1,000,000 seats.");
        System.out.println("Enter the total number of seats: ");
        int totalSeats = myScanner.nextInt();
        System.out.println("Note: the total number of parties cannot exceed 100 parties.");
        System.out.println("Enter the total number of parties: ");
        int parties = myScanner.nextInt();

        // Calculations and Output:
        int totalVotes = 0;
        int allParties[] = new int[parties]; // List of all the parties.
        double allSeats[] = new double[parties]; // List of the amount of seats each party has.
        for(int i = 0; i < parties; i++) { // Looping through from 0 to parties-1.
            allParties[i] = myScanner.nextInt(); // Reading input for num of votes each party gets.
            totalVotes += allParties[i]; // Adding the votes to the total votes.
        }
        for(int i = 0; i < parties; i++){
            allSeats[i] = (allParties[i] / totalVotes) * totalSeats; // Calculating the and outputting the number of seats.
            System.out.println(Math.round(allSeats[i]));
        }
        myScanner.close();
    }
}