package G12_Chapter_8;

// @author Forrest Wang
// November 5, 2021
//
// My_Math
// Create a My_Math application that lets the user run methods sumUpTo();, factorial();, isPrime();, isPerfect();,
// printPerfectNums();, printMersennePrimes();, and printEvenPerfectNums();.

// Import(s):
import java.util.Scanner;

public class My_Math {

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should sum up all the consecutive numbers up until n.
   */
  public static int sumUpTo(int n) {
    int sum = 0;

    // Sum everything:
    for (int i = 1; i <= n; i++) {sum += i;}

    return sum;
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should return the factorial of n (n!).
   */
  public static long factorial(int n) {
    long f = 1;

    // Calculate n!:
    for (int k = 2; k <= n; k++) {f *= k;}

    return f;
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should return true if n is a prime number, and false if n is not a prime number.
   */
  public static boolean isPrime(int n) {
	  // Eliminate the exceptions:
      if (n == 0 || n == 1) {return false;}

      for (int i = 2; i < Math.sqrt(n); i++){
		  if (n % i == 0) {return false;}
	  }
	  
	  return true;
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should return true if n is a perfect number, and false if it is not a perfect number.
   */
  public static boolean isPerfect(int n) {
	  int sum = 1;
	  
	  for (int i = 2; i < n; i++) {
		  // Sum up divisors:
		  if (n % i == 0) {sum += i;}
		  
		  // Check if the sum is a perfect number:
		  else if (sum == n && i == n - 1) {return true;}
	  }
	  
	  return false;
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should output the first n perfect numbers.
   */
  public static void printPerfectNums(int n) {
	  int perfectNumbersFound = 0;
	  
	  System.out.print("The first " + n + " perfect numbers: ");
	  
	  for (int i = 2; perfectNumbersFound < n; i++) {
		  if (isPerfect(i)) {
			  System.out.print(i);
			  perfectNumbersFound++;

			  // Commas and periods:
			  if (perfectNumbersFound <= n - 1) {System.out.print(", ");}
			  
			  else {System.out.print(".");}
		  }
	  }
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should output the first n mersenne prime numbers.
   */
  public static void printMersennePrimes(int n) {

	int number = 1;
	  
	System.out.print("The first " + n + " mersenne primes: ");
	
	for (int mersennePrimesFound = 0; mersennePrimesFound < n; mersennePrimesFound++) {
		number *= 2;
		
		if (isPrime(number - 1)) {
			System.out.print(number);

			// Commas and periods:
			if (mersennePrimesFound <= n - 1) {System.out.print(", ");}
			  
			else {System.out.print(".");}
		}
	}
  }

  /**
   * Pre-condition: Requires the value of n.
   * Post-condition: Should output the first n even perfect numbers.
   */
  public static void printEvenPerfectNums(int n) {

	long number = 1;
	  
	System.out.print("The first " + n + " even perfect numbers: ");
	
	for (int evenPerfectNumbersFound = 0; evenPerfectNumbersFound < n; evenPerfectNumbersFound++) {
		number *= 2;
		
		if (isPrime((int) number - 1)) {
			long evenPerfectNumber = (number - 1) * number / 2;
			
			System.out.print(evenPerfectNumber);

			
			if (evenPerfectNumbersFound <= n - 1) {System.out.print(", ");}
			  
			else {System.out.print(".");}
		}
	}
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter which method you want to run: ");
    System.out.println("1. Sum all consecutive numbers until n");
    System.out.println("2. Calculate the factorial of n");
    System.out.println("3. Determine if n is a prime number");
    System.out.println("4. Determine if n is a perfect number");
    System.out.println("5. Calculate the first n perfect numbers");
    System.out.println("6. Calculate the first n Mersenne prime numbers");
    System.out.println("7. Calculate the first n even perfect numbers");
    byte choice = myScanner.nextByte();

    System.out.println("Enter the value of the n: ");
    int n = myScanner.nextInt();

      switch (choice) {
          case 1 -> System.out.println(sumUpTo(n));
          case 2 -> System.out.println(factorial(n));
          case 3 -> System.out.println(isPrime(n));
          case 4 -> System.out.println(isPerfect(n));
          case 5 -> printPerfectNums(n);
          case 6 -> printMersennePrimes(n);
          case 7 -> printEvenPerfectNums(n);
      }
  }
}