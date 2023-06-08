package G12_Chapter_3;

// @author Forrest Wang
// September 23, 2021
//
// Coffee_Cup
// Adds the methods isFull();, fill();, and drink()); to coffee cups.

public class Coffee_Cup {
	
	private boolean isFull;  // Default value false.

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should return true if the cup is filled with coffee, and false otherwise.
     */
    public boolean isFull() {
		return isFull;
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should fill the cup with coffee.
     */
    public void fill() {
		isFull = true;
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should drink from the coffee cup if it is full, or print an error message.
     */
    public void drink() {
		if (isFull) {
	    	System.out.println("You glug the coffee down.");
	    	isFull = false;
		}

		else {System.out.println("You sip furiously, but only suck air.");}
    }
}
