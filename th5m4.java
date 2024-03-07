// Method Overriding
// A class
class A {
    void make() {
        System.out.println("A makes a sound");
    }
}

// D class inherits from A and overrides make method
class D extends A {
    @Override
    void make() {
        System.out.println("D barks");
    }
}

public class th5m4 {
    public static void main(String[] args) {
        D my = new D();
        my.make();
    }
}