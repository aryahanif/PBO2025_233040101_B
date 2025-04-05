package Pertemuan_6;

public class Matakuliah {
	
	private Dosen dosenPengampu;
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	public Matakuliah(String kode, String nama, String index, int sks, Dosen dosenPengampu) {
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	    this.dosenPengampu = dosenPengampu;
	}

	public double nilaiIndex() {
	    switch (index) {
	        case "A": return 4.0;
	        case "AB": return 3.5;
	        case "B": return 3.0;
	        case "BC": return 2.5;
	        case "C": return 2.0;
	        case "D": return 1.0;
	        case "E": return 0.0;
	        default: return 0.0;
	    }
	}

	public int getSks() {
	    return sks;
	}
	
	public Dosen getDosenPengampu() {
	    return dosenPengampu;
	}
	
	public String display() {
		return kode + " - "+ nama +" - "+ index+ " - " + dosenPengampu.getNama();
	}
}
