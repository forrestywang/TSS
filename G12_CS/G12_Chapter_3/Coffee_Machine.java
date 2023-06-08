package G12_Chapter_3;

// @author Forrest Wang
// September 23, 2021
//
// Coffee_Machine
// Adds the methods setStrength());, grindBeans();, brew();, addWater();, addBeans());, to coffee machines.

/* A fancy coffee maker.  Makes coffee of varying strengths. */
public class Coffee_Machine {
	
	// The current strength of the coffee.
    private String strength = "Killer Intense";

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should set the strength for the coffee. The user can chose between "Weak", "Regular", "Strong",
     * or others.
     */
    public void setStrength(String s) {
        strength = s;
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should grind the coffee beans.
     */
    public void grindBeans() {
        System.out.println("Grinding beans for " +
            strength + " coffee.");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should brew coffee into the coffee cup.
     */
    public void brew(Coffee_Cup c) {
        System.out.println("Brewing coffee.");
        c.fill();
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should add water to the coffee machine.
     */
    public void addWater() {
        System.out.println("Adding Water");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should add beans to the coffee machine.
     */
    public void addBeans() {
        System.out.println("Adding Beans");
    }
}