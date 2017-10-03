import java.util.Scanner;

public class Trianlges {

	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in); 

// User will enter three sides of triangle 
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
// If input is valid, compute area. Otherwise, display that input is invalid
		System.out.println(isValid(side1, side2, side3) ? 
			"The area of the triangle is " + area(side1, side2, side3) :
			"Input is invalid");
	}

	/** Method isValid returns true if the sum of any 
	/** two sides is greater than the third side. */
	public static boolean isValid(
		double side1, double side2, double side3) {
		boolean valid =
			side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}

	/** Method area returns the area of the triangle. */
	public static double area(
		double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}