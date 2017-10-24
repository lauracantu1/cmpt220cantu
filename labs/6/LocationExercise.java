import java.util.Scanner;

public class LocationExercise {
	private static Scanner input;

/** Main method */
	public static void main(String[] args) {
		input = new Scanner(System.in);

		
// Prompt the user to enter an integer a, b, c, d, e, and f
		System.out.print("Enter an integer for a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

// Create a LinearEquation object
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
// Display results with if or else
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() +
				" and y is " + linearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}