package org.java.animals;

public class Delfino extends Animale implements INuotante {
	@Override
	public void verso() {
		System.out.println("Il delfino fischia");
	}
	
	@Override
	public void mangia() {
		System.out.println("Il delfino mangia pesci, calamari, seppie, polpi, gamberi, granchi, plancton");
	}
}
