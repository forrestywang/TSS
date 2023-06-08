package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Population
// Create a Population application that calculates the year Mexico will have a population of 120 million, assuming that
// it has a current population of 106.2 million in 2005.

public class Population {
    public static void main(String[] args) {

        // Constants:
        final double GROWTH_RATE = 1.017;
        final byte POPULATION_GOAL = 120;

        // Variables:
        double currentPopulation = 106.2;
        int years = 2005;

        // Calculations:
        while (currentPopulation <= POPULATION_GOAL) {
            currentPopulation *= GROWTH_RATE;
            years++;
        }

        // Output:
        System.out.println("Mexico's population will reach " + POPULATION_GOAL + " million in " + years + ".");
    }
}