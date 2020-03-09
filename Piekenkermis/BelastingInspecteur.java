package Piekenkermis;

public class BelastingInspecteur {
	
	private double schatkist;
	Kermis kermis;
	
	BelastingInspecteur(Kermis q){
		this.kermis = q;
	}
	
	void heffen() {
		for (Attractie x : kermis.rides) {
			if( x instanceof GokAttractie ) {
				schatkist +=
						( (GokAttractie) x ).kansspelBelasting();
			}else { System.out.println("niksaandehand");
			}
		}
	}//endofheffen
	
	void inspecteurOpJeDak() {
		
		this.heffen();
		kermis.k.berekenTotaalOmzet();
		System.out.println("De inspecteur is langsgeweest.");
		System.out.println("Hij neemt ƒ " + getSchatkist() + " mee.");
		System.out.println("De overgebleven totaalomzet is nu " + kermis.k.getTotaalOmzet());
	}
	
	double getSchatkist() {
		return schatkist;
	}
	
	
}//endofBelastingInspecteur
