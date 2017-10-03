public class DisplayMatrix {

    public static void main(String[] args) {

        printMatrix(3); // JA: You were supposed to read the size from the user
    }

    public static void printMatrix(int n) {

        for (int column = 0; column < n; column++) {

            for (int row = 0; row < n; row++) {
                System.out.printf("%1d ", (int)(Math.random() * 2));
            }
            System.out.println("");
        }
    }
}