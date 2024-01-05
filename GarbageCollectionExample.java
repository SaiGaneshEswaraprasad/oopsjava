public class GarbageCollectionExample {
    public static void main(String[] args) {

        GarbageCollectionExample obj = new GarbageCollectionExample();
        System.out.println("Object HashCode: " + obj.hashCode());

        obj = null;

        System.gc();

        System.out.println("End of garbage collection");
    }
    @Override
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}
