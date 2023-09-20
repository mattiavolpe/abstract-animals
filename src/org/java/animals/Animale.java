package org.java.animals;

public abstract class Animale {
	public void dormi() {
		System.out.println("Zzz");
	};
	
	public abstract void verso();
	public abstract void mangia();
	
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}
