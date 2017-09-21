
import java.util.Scanner;

public class CheckLetter{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
 //Prompt user to enter a letter
        
        System.out.print("Enter a letter : ");
        String letter = in.next();
        
        char let = Character.toLowerCase(letter.charAt(0));
if (!Character.isLetter(let))
		System.out.println(letter + " is invalid input.");
else
        {
switch(let)
            {
            	case 'a': case 'e': case 'i': case 'o': case 'u':
System.out.println(letter + " is a vowel");
 break;
                default:
                    System.out.println(letter + " is a consonant");
            }    
        }
        
    }
}