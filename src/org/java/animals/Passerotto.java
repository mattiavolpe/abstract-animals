package org.java.animals;

public class Passerotto extends Animale implements IVolante {
	@Override
	public void verso() {
		System.out.println("Il passerotto cinguetta");
	}
	
	@Override
	public void mangia() {
		System.out.println("Il passerotto mangia semi, granaglie, insetti, verdura, frutta, nettare, pane bagnato");
	}
}
