// Hierarchical Inheritance
// A class
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

// C class inherits from A
class C extends A {
    void meow() {
        System.out.println("C is meowing");
    }
}

public class th3m4 {
    public static void main(String[] args) {
        D my = new D();
        my.eat();
        my.bark();

        C mo = new C();
        mo.eat();
        mo.meow();
    }
}