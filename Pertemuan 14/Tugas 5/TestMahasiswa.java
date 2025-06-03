package Pertemuan_14;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("N001", "Budi");
        Mahasiswa mhs2 = new Mahasiswa("N002", "Ani");
        
        mhs1.displayInfo();
        System.out.println("-----");
        mhs2.displayInfo();
        
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Maks SKS Global: " + Mahasiswa.MAX_SKS);
    }
}
