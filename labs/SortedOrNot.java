import java.util.Scanner;

public class SortedOrNot {
	private static Scanner input;

	/** Main method */
	public static void main(String[] args) {
		input = new Scanner(System.in);

//User will enter a list
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

// Message displaying whether the list is sorted or not
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	/** isSorted will return true if the list is sorted in increasing order. 
	 * Otherwise it will be false */
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}
