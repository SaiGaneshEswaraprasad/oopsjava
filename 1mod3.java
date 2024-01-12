import java.util.Arrays;
import java.util.Scanner;

public class 1mod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform linear search
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        int searchResult = linearSearch(array, searchElement);

        if (searchResult != -1) {
            System.out.println("Element found at index " + searchResult);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Perform sorting
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        scanner.close();
    }

    // Linear search function
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
