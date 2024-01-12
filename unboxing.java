public class unboxing {
    public static void main(String[] args) {
        // Unboxing - converting Integer object to primitive int
        Integer boxedInt = 42;
        int unboxedInt = boxedInt;

        // Unboxing - converting Double object to primitive double
        Double boxedDouble = 3.14;
        double unboxedDouble = boxedDouble;

        // Unboxing - converting Character object to primitive char
        Character boxedChar = 'A';
        char unboxedChar = boxedChar;

        // Printing the values
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Unboxed char: " + unboxedChar);
    }
}
