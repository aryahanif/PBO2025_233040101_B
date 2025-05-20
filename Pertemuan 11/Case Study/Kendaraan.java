package Pertemuan_11;

//Kelas abstrak Kendaraan sebagai superclass dari semua kendaraan
public abstract class Kendaraan {
 protected String nama; // Atribut nama kendaraan

 // Konstruktor untuk inisialisasi nama
 public Kendaraan(String nama) {
     this.nama = nama;
 }

 // Method umum yang berlaku untuk semua kendaraan
 public void jalan() {
     System.out.println(nama + " sedang berjalan.");
 }

 public void berhenti() {
     System.out.println(nama + " berhenti.");
 }

 // Method abstrak: wajib diimplementasikan oleh subclass
 public abstract void hidupkanMesin();
}
