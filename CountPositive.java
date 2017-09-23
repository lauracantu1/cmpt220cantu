
import java.util.Scanner;

public class CountPositive {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positivenum = 0; 	
		int negativenum = 0; 
		int count = 0;			
//get total
		double total = 0;		


// Tell  user to enter an integer or 0 to exit
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {	
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while (number != 0) { 
		if (number > 0)
				positivenum++;
		else
				negativenum++;	
			total += number;	
			count++;				
			number = input.nextInt();
		}

		double average = total / count;

// show the results
		System.out.println(
			"The number of positive is " + positivenum + "\nThe number of negatives is " + negativenum +"\nThe total is total " + total + "\nThe average is " + average);
	}
}