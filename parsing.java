import java.util.Scanner;

public class parsing {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number as a string: ");
        String userInput = scanner.nextLine();

        // Parsing the user input to an integer
            int parsedNumber = Integer.parseInt(userInput);
            System.out.println("Parsed number using Integer.parseInt(): " + parsedNumber);

        // Parsing the user input to a double
        
            double parsedDouble = Double.parseDouble(userInput);
            System.out.println("Parsed number using Double.parseDouble(): " + parsedDouble);

        // Parsing the user input to an integer using binary base
            int parsedBinary = Integer.parseInt(userInput, 2);
            System.out.println("Parsed number as binary using Integer.parseInt(): " + parsedBinary);

        // Parsing the user input to an integer using octal base
            int parsedOctal = Integer.parseInt(userInput, 8);
            System.out.println("Parsed number as octal using Integer.parseInt(): " + parsedOctal);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
