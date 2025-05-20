package Pertemuan_10;

abstract class Hewan {
	
	abstract void suara(); // Metode abstrak
	
	public void makan() { // Metode konkret
		System.out.println("Eating...");
	}
}
