package org.java.animals;

public class Cane extends Animale implements INuotante {
	public void verso() {
		System.out.println("Il cane abbaia");
	}
	
	public void mangia() {
		System.out.println("Il cane mangia carne, verdura, frutta, pesce");
	}
}
