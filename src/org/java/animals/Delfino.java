package org.java.animals;

public class Delfino extends Animale implements INuotante {
	public void verso() {
		System.out.println("Il delfino fischia");
	}
	
	public void mangia() {
		System.out.println("Il delfino mangia pesci, calamari, seppie, polpi, gamberi, granchi, plancton");
	}
//
//	@Override
//	public void nuota() {
//		System.out.println("Sto nuotando!!!");
//	}
}
