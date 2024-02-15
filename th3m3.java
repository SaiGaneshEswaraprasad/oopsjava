import java.util.Scanner;

public class th3m3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the jagged array: ");
        int numRows = scanner.nextInt();

        // Creating a jagged array
        int[][] jaggedArray = new int[numRows][];

        // Taking input for each row
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of elements for row " + (i + 1) + ": ");
            int numElements = scanner.nextInt();

            // Allocating space for each row based on user input
            jaggedArray[i] = new int[numElements];

            // Taking input for each element in the row
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < numElements; j++) {
                System.out.print("Enter element " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("\nJagged Array:");

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
