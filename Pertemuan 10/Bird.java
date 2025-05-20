package Pertemuan_10;

public class Bird extends Hewan implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("Akulah sang melayu");
	}

	@Override
	public void suara() {
		System.out.println("wiw");
	}
	
	
}
