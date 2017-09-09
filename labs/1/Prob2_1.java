
	import java.util.Scanner;

	public class Prob2_1 {
		private static Scanner input;

		public static void main(String[] args) {
			input = new Scanner(System.in);

// Get Temperature from user 
			System.out.print("Enter a degree in Celsius: ");
			double celsius = input.nextDouble();

// Convert to Fahrenheit 
			double fahrenheit = (9.0 / 5 * celsius + 32);
			System.out.println(celsius + " Celsius is " + fahrenheit
				+ " Fahrenheit"); 
		}
	

}
