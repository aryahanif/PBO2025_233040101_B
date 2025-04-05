package Pertemuan_6;

public class Mahasiswa {
	
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String display() {
        return "Mahasiswa: " + nama + " (" + nim + ")";
    }
}
