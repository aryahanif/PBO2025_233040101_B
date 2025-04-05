package Pertemuan_5;

public class MatakuliahMain {
	
	public static void main(String[] args) {
		
		double totalNilai = 0;
		int totalSKS = 0;
		
		// Create objek matakuliah
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
		
		// Tampilkan daftar matakuliah\
		System.out.println("---DAFTAR MATAKULIAH---");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());
		
		System.out.println("---NILAI IPK---");

		Matakuliah[] daftarMK = { mk1, mk2, mk3 };

		for (Matakuliah mk : daftarMK) {
		    totalNilai += mk.nilaiIndex() * mk.getSks();
		    totalSKS += mk.getSks();
		}

		double ipk = totalNilai / totalSKS;
		System.out.println("IPK: " + ipk);

	}

}
