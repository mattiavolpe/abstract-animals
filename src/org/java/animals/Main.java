package org.java.animals;

public class Main {
	public static void main(String[] args) {
		Cane cane1 = new Cane();
		Passerotto passerotto1 = new Passerotto();
		Aquila aquila1 = new Aquila();
		Delfino delfino1 = new Delfino();
		
		Animale[] animali = new Animale[4];
		
		animali[0] = cane1;
		animali[1] = passerotto1;
		animali[2] = aquila1;
		animali[3] = delfino1;
		
		for (int i = 0; i < animali.length; i++) {
			Animale animaleCorrente = animali[i];
			
			animaleCorrente.dormi();
			animaleCorrente.verso();
			animaleCorrente.mangia();
			
			System.out.print("\n");
						
			if (animaleCorrente instanceof IVolante) {
				IVolante volante = (IVolante) animaleCorrente;
				faiVolare(volante);
			}
			
			if (animaleCorrente instanceof INuotante) {
				INuotante nuotante = (INuotante) animaleCorrente;
				faiNuotare(nuotante);
			}
			
			System.out.println("--------------------\n");
		}
		
		
	}
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
}
