package G12_Chapter_3;

// @author Forrest Wang
// September 23, 2021
//
// Brewing_Coffee
// Make a Brewing_Coffee program that brews coffee.

public class Brewing_Coffee {

    public static void main(String[] args) {

        // Declare a reference to a CoffeeMachine.
        Coffee_Machine coffeeMachine;

        // Create a new CoffeeMachine and make the variable refer to it.
        coffeeMachine = new Coffee_Machine();

        // Add water and beans to the CoffeeMachine.
        coffeeMachine.addWater();
        coffeeMachine.addBeans();

        // Get ready to grind some strong coffee in the CoffeeMachine.
        coffeeMachine.setStrength("strong");

        // Grind the beans.
        coffeeMachine.grindBeans();

        // Declare a reference to a CoffeeCup.
        Coffee_Cup coffeeCup1;

        // Create a new CoffeeCup and make the variable refer to it.
        coffeeCup1 = new Coffee_Cup();

        // Have your CoffeeMachine brew coffee into the coffee cup.
        coffeeMachine.brew(coffeeCup1);

        // Drink from the cup.
        coffeeCup1.drink();

        // Try to drink again --the cup is now empty.
        coffeeCup1.drink();

        // Declare ANOTHER coffee cup reference and initialize it.
        Coffee_Cup coffeeCup2 = new Coffee_Cup();

        // Brew coffee into the new cup.
        coffeeMachine.brew(coffeeCup2);

        // Try to drink from the first cup --it's still empty!
        coffeeCup1.drink();

        // Drink from the second cup.
        coffeeCup2.drink();

        // Print a sigh of satisfaction.
        System.out.println("Ahhh.");
    }
}