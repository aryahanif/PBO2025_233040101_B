package Pertemuan_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {

    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0;
        int totalSKS = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += mk.nilaiIndex() * mk.getSks();
                totalSKS += mk.getSks();
            }
        }
        if (totalSKS != 0) {
            this.ipk = totalNilai / totalSKS;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.printf("IPK: %.2f\n", ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
