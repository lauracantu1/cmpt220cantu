import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computer = (int)(Math.random() * 3);

		// User will enter 0, 1, or 2
		System.out.print("rock (0), paper (1), scissor (2): ");
		int user = input.nextInt();

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: 
				System.out.print("rock");
			break;
			case 1:
				System.out.print("paper");
			break;
			case 2:
				System.out.print("scissor");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0:
				System.out.print("rock");
			break;
			case 1:
				System.out.print("paper");
			break;
			case 2:
				System.out.print("scissor");
		}

		// Display result
		if 
		(computer == user)
			System.out.println(" too. It is a draw");
		else
			
		{
			boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || 
							  (user == 2 && computer == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}
}
