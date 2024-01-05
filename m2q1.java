import java.util.Scanner;

public class m2q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations and display the results
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));

        scanner.close();
    }

    // Method to add two numbers
    private static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    private static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    private static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    private static double divide(int a, int b) {
            return (double) a / b;
    }
}
