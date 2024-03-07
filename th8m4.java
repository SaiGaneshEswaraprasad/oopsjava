// Interfaces
interface A {
    void showA();
}

interface B {
    void showB();
}

class th8m4 implements A, B {
    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        th8m4 obj = new th8m4();
        obj.showA(); // Output: A
        obj.showB(); // Output: B
    }
}