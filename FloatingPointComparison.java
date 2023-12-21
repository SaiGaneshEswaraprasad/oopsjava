import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double number2 = scanner.nextDouble();
        if (areEqualUpToThreeDecimalPlaces(number1, number2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        scanner.close();
    }
    private static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);
        return scaledNum1 == scaledNum2;
    }
}
