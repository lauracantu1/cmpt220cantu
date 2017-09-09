import java.util.Scanner;
public class Prob2_9 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

// User will enter the starting velocity v0 in meters per second, the ending velocity v1 in meter per second and the time span t in seconds.
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

// Calculate the average acceleration
		double a = (v1 - v0) / t;

		System.out.println("The average acceleration is " + a);
	}
}