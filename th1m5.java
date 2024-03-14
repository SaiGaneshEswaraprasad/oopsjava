// Using import package.*

// File: MyClass.java (in package mypackage)
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass!");
    }
}

// File: Main.java (in a different package)
import mypackage.*;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}