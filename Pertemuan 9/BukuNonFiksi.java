package Pertemuan_9;

public class BukuNonFiksi extends Buku {
    private String bidang;

    public BukuNonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bidang: " + bidang);
    }
}
