// Multilevel Inheritance
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

// L class inherits from D
class L extends D {
    void swim() {
        System.out.println("L is swimming");
    }
}

public class th2m4 {
    public static void main(String[] args) {
        L my = new L();
        my.eat();
        my.bark();
        my.swim();
    }
}