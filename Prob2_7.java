import java.util.Scanner; 
public class Prob2_7 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

// Enter minutes 
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

// Compute the number of years and days
		int years = minutes / 525600;
		int extraMinutes = minutes % 525600;
		int days = extraMinutes / 1440;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
}
}