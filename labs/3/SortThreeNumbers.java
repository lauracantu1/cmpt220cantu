import java.util.Scanner;

public class SortThreeNumbers {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner

//Tell user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

// Display numbers in increasing order
		displaySortedNumbers(number1, number2, number3);
	}

	public static void displaySortedNumbers(
		double n1, double n2, double n3) {
		double temp; 
		
		if (n2 < n1 && n2 < n3){
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		else if (n3 < n1 && n3 < n2) {
			temp = n1; 
			n1 = n3;
			n3 = temp;
		}
		if (n3 < n2) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
// Show the results
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}