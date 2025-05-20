package Pertemuan_11;

//Kelas Mobil mewarisi dari Kendaraan dan mengimplementasikan Pajak
public class Mobil extends Kendaraan implements Pajak {

 // Konstruktor memanggil konstruktor super
 public Mobil(String nama) {
     super(nama);
 }

 // Implementasi method abstrak dari Kendaraan
 @Override
 public void hidupkanMesin() {
     System.out.println(nama + " menyalakan mesin dengan kunci remote.");
 }

 // Implementasi method dari interface Pajak
 @Override
 public void bayarPajak() {
     System.out.println(nama + " membayar pajak mobil tahunan.");
 }
}
