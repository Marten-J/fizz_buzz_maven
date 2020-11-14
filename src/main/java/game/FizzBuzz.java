package src.main.java.game;

import java.util.Scanner;

/***
 * A basic fizzbuzz program 
 * @author Marten
 *
 */
public class FizzBuzz {

	/***
	 * Output string for fizz
	 */
	public static final String FIZZ = "Fizz";
	/***
	 * Output string for buzz
	 */
	public static final String BUZZ = "Buzz";
	/***
	 * Output string for fizz buzz
	 */
	public static final String FIZZBUZZ = "Fizz Buzz";

	/***
	 * Main method that will ask the user for a number
	 * and check the number for the result
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(gameLogic(num));
	}
	
	/***
	 * FizzBuzz game logic
	 * @param number Number to validate
	 * @return The result
	 */
	public static String gameLogic(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
            return FIZZBUZZ;
        } else if (number % 5 == 0) {
        	return BUZZ;
        } else if (number % 3 == 0) {
        	return FIZZ;
        } else {
            return Integer.toString(number);
        }
	}
}
