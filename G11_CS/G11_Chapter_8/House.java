package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// House
// Create a House application that calls methods addRoof(), addBase(), and andWalk() to display an ASCII house.

public class House {

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should output the roof of the house.
     */
    public static void addRoof() {
        // Output:
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("/______\\");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should output the base of the house.
     */
    public static void addBase() {
        // Output:
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should output the entrance of the house.
     */
    public static void addWalk() {
        // Output:
        System.out.println("   **");
        System.out.println("   ***********");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should output an ASCII house.
     */
    public static void main(String[] args) {
        // Output:
        addRoof();
        addBase();
        addWalk();
    }
}