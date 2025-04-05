package Pertemuan_6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	
	private String semester;
	private double ips;
	private List<Matakuliah> daftarMatakuliah;
	
	public KartuHasilStudi(String semester) {
		this.semester = semester;
		this.daftarMatakuliah = new ArrayList<>();
	}
	
	public void addMatakuliah(Matakuliah matakuliah) {
		daftarMatakuliah.add(matakuliah);
	}
	
	public void hitungIPS() {
		double totalNilai = 0;
		int totalSKS = 0;
		for (Matakuliah mk : daftarMatakuliah) {
			totalNilai += mk.nilaiIndex() * mk.getSks();
			totalSKS += mk.getSks();
		}
		if (totalSKS != 0) {
			this.ips = totalNilai / totalSKS;
		}
	}

	public double getIPS() {
		return ips;
	}
	
	public String getSemester() {
	    return semester;
	}

	public List<Matakuliah> getDaftarMatakuliah() {
		return daftarMatakuliah;
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Semester: ").append(semester).append("\n");
		for (Matakuliah mk : daftarMatakuliah) {
			sb.append(mk.display()).append("\n");
		}
		sb.append("IPS Semester Ini: ").append(String.format("%.2f", ips)).append("\n");
		return sb.toString();
	}
}
