// Using fully qualified name:

// File: A.java (in package pack)
package pack;

public class A {
    public void dis() {
        System.out.println("Hello from A!");
    }
}

// File: Main.java (in a different package)
public class Main {
    public static void main(String[] args) {
        pack.A obj = new pack.A();
        obj.dis();
    }
}