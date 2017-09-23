import java.util.Scanner;

public class ReadInteger {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// User will enter an integer
		System.out.print("Enter any integer: ");
		int number = input.nextInt();
		int index = 2; // Numbers to test as factors 

// Find and show all the smallest factors 
		while (number / index != 1) {
		if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; }
		else
				index++; 
		}
		System.out.println(number + ".");
	}
}