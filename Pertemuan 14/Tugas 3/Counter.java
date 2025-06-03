package Pertemuan_14;

public class Counter {
    private static int instanceCount = 0; // Variabel static

    public Counter() {
        instanceCount++; // Bertambah setiap objek dibuat
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
