// Super Keyword
// A class
class A {
    String color;

    A(String color) {
        this.color = color;
    }
}

// D class inherits from A
class D extends A {
    String breed;

    D(String color, String breed) {
        super(color);
        this.breed = breed;
    }
}

public class th4m4 {
    public static void main(String[] args) {
        D my = new D("Brown", "Labrador");
        System.out.println("Color: " + my.color);
        System.out.println("Breed: " + my.breed);
    }
}