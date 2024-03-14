// Using import package.*

// File: A.java (in package pack)
package pack;

public class A {
    public void dis() {
        System.out.println("Hello from A!");
    }
}

// File: Main.java (in a different package)
import pack.*;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.dis();
    }
}