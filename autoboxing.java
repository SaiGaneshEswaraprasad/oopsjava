public class autoboxing {
    public static void main(String[] args) {
        // Autoboxing - converting primitive int to Integer object
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;

        // Autoboxing - converting primitive double to Double object
        double primitiveDouble = 3.14;
        Double boxedDouble = primitiveDouble;

        // Autoboxing - converting primitive char to Character object
        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;

        // Printing the values
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
    }
}
