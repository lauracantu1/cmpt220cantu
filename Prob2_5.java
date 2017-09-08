import java.util.Scanner;

public class Prob2_5 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);	
// User will enter Subtotal and Gratuity Rate.
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double stotal = input.nextDouble();
		double gratRate = input.nextDouble();

// Calculate gratuity and total
		double gratuity = stotal * (gratRate / 100);
		double total = stotal + gratuity;
// Results
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
} 