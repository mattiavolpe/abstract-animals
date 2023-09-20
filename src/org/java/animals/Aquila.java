package org.java.animals;

public class Aquila extends Animale implements IVolante, INuotante {
	public void verso() {
		System.out.println("L'aquila grida");
	}
	
	public void mangia() {
		System.out.println("L'aquila mangia conigli, lepri, scoiattoli, marmotte, anatre, piccioni, pesci, rettili");
	}
}
