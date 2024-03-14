// Using fully qualified name:

// File: MyClass.java (in package mypackage)
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass!");
    }
}

// File: Main.java (in a different package)
public class Main {
    public static void main(String[] args) {
        mypackage.MyClass obj = new mypackage.MyClass();
        obj.display();
    }
}