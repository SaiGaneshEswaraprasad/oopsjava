// Exception Handling 

public class th4m5 {
    public static void main(String[] args) {
        try {
            // Block of code to monitor for errors
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            // Exception handler for ArithmeticException
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // Block of code to be executed after try block ends
            System.out.println("Finally block executed.");
        }
    }
    
    public static int divide(int a, int b) {
        return a / b;
    }
}