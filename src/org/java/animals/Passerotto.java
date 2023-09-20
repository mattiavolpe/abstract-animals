package org.java.animals;

public class Passerotto extends Animale implements IVolante {
	public void verso() {
		System.out.println("Il passerotto cinguetta");
	}
	
	public void mangia() {
		System.out.println("Il passerotto mangia semi, granaglie, insetti, verdura, frutta, nettare, pane bagnato");
	}
//
//	@Override
//	public void vola() {
//		System.out.println("Sto volando!!!");
//	}
}
