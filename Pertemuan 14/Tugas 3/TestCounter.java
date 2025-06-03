package Pertemuan_14;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Awal: " + Counter.getInstanceCount() + " instance");
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Total instance: " + Counter.getInstanceCount());
    }
}
