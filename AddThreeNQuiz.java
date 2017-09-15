import java.util.Scanner;

public class AddThreeNQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int answer;
		
		do  {
			System.out.print( "What is " + number1 
					+ " + " + number2 + " + " + number3 + "? ");
			answer = input.nextInt();	
			if ( number1 + number2 + number3 != answer) 
				System.out.println("Wrong answer. Try again.");
		} while (number1 + number2 + number3!= answer);
		
		System.out.println("You got it!");

	}

}