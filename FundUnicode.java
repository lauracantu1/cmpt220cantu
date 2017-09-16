


import java.util.Scanner;

public class FundUnicode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Tell user to enter code
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        input.close();

        System.out.println("The Unicode for the character " + character + " is " + (int) character);
    }
}