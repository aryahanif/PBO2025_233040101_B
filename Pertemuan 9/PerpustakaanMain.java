package Pertemuan_9;

public class PerpustakaanMain {
    public static void main(String[] args) {
        BukuFiksi novel = new BukuFiksi("Laskar Pelangi", "Andrea Hirata", "Drama");
        BukuNonFiksi ensiklopedia = new BukuNonFiksi("Ensiklopedia Sains", "Albert", "Ilmu Pengetahuan");

        System.out.println("== Buku Fiksi ==");
        novel.displayInfo();
        System.out.println();

        System.out.println("== Buku Non-Fiksi ==");
        ensiklopedia.displayInfo();
    }
}
