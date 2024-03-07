// Simple Inheritance
class A {
    void eat() {
        System.out.println("A is eating");
    }
}

// D class inherits from A
class D extends A {
    void bark() {
        System.out.println("D is barking");
    }
}

public class th1m4 {
    public static void main(String[] args) {
        D my = new D();
        my.eat();
        my.bark();
    }
}