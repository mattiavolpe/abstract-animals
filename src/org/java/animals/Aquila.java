package org.java.animals;

public class Aquila extends Animale implements IVolante, INuotante {
	public void verso() {
		System.out.println("L'aquila grida");
	}
	
	public void mangia() {
		System.out.println("L'aquila mangia conigli, lepri, scoiattoli, marmotte, anatre, piccioni, pesci, rettili");
	}
//
//	@Override
//	public void nuota() {
//		System.out.println("Sto nuotando!!!");
//	}
//
//	@Override
//	public void vola() {
//		System.out.println("Sto volando!!!");
//	}
}
