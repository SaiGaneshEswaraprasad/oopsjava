import java.util.Scanner;

public class NumberRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = scanner.nextInt();
        System.out.println("Expected Output:");
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            // Print spaces
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        scanner.close();
    }
}
