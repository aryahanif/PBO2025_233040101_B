package Pertemuan_11;

//Kelas utama untuk menjalankan program
public class KendaraanMain {
 public static void main(String[] args) {
     // Membuat objek Mobil dan Motor
     Mobil avanza = new Mobil("Avanza");
     Motor vario = new Motor("Vario");

     // Menjalankan method-method pada objek Mobil
     avanza.hidupkanMesin();
     avanza.jalan();
     avanza.berhenti();
     avanza.bayarPajak();

     System.out.println();

     // Menjalankan method-method pada objek Motor
     vario.hidupkanMesin();
     vario.jalan();
     vario.berhenti();
     vario.bayarPajak();
 }
}
