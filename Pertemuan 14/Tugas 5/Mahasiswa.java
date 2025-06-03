package Pertemuan_14;

public class Mahasiswa {
    private final String nim; // Variabel final
    private String nama;
    public static int totalMahasiswa = 0; // Static counter
    public static final int MAX_SKS = 24; // Konstanta global

    public Mahasiswa(String nim, String nama) {
        this.nim = nim; // Inisialisasi final via constructor
        this.nama = nama;
        totalMahasiswa++; // Update counter
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Maks SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
