package Pertemuan_11;

//Kelas Motor mewarisi dari Kendaraan dan mengimplementasikan Pajak
public class Motor extends Kendaraan implements Pajak {

 // Konstruktor memanggil konstruktor super
 public Motor(String nama) {
     super(nama);
 }

 // Implementasi method abstrak dari Kendaraan
 @Override
 public void hidupkanMesin() {
     System.out.println(nama + " menyalakan mesin dengan kick starter.");
 }

 // Implementasi method dari interface Pajak
 @Override
 public void bayarPajak() {
     System.out.println(nama + " membayar pajak motor tahunan.");
 }
}
