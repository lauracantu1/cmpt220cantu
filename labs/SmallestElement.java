import java.util.Scanner;

public class SmallestElement {
	private static Scanner input;



	/** Main method */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		double[] numbers = new double[10]; // Array of 10 will be created

// User will enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Show the smallest value 
		System.out.println("The minimum number is: " + min(numbers));
	}


	
	public static double min(double[] array) {
		double min = array[0];	
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}