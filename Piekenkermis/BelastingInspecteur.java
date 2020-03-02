package Piekenkermis;

public class BelastingInspecteur {
	
	private double schatkist;
	
	void heffen() {
		for (Attractie x : Kermis.rides) {
			if( x.gokken = true ) {
				schatkist +=
						(((GokAttractie)x).kansspelBelasting());
			}else { System.out.println("niksaandehand");
			}
		}
	}//endofheffen
	
	void inspecteurOpJeDak() {
		this.heffen();
		System.out.println("De inspecteur is langsgeweest.");
		System.out.println("Hij neemt ƒ " + getSchatkist() + " mee.");
		System.out.println("De overgebleven totaalomzet is nu " + MainPiekenKermis.k.getTotaalOmzet());
	}
	
	double getSchatkist() {
		return schatkist;
	}
}//endofBelastingInspecteur
