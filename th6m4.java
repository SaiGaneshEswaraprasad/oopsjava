//Abstract Class
// Abstract class representing an A
abstract class A
 {
    abstract public void make();

    public void sleep() {
        System.out.println("A is sleeping");
    }
}

// D class inherits from A and implements make method
class D extends A 
{
    @Override
    public void make() 
    {
        System.out.println("D says Woof!");
    }
}

public class th6m4 
{
    public static void main(String[] args) {
        D myDog = new D();
        myDog.make();
        
    }
}