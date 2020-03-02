package Piekenkermis;

public class Ladderklimmen_5 extends Attractie implements GokAttractie{

	Ladderklimmen_5(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
	}
	public double kansspelBelasting() {
		Kermis.rides[5].berekenOmzet();
		double belasting = Kermis.rides[5].getOmzet()* 0.3;
		
		System.out.println("DEBUG via attr omzet:" + getOmzet());
		System.out.println("DEBUG via rides5: " + Kermis.rides[5].getOmzet());
		System.out.println("DEBUG belasintg:" + belasting);
		
		setOmzet(getOmzet() - belasting);
System.out.println("DEBUG nieuwe omzet" + omzet);
		return belasting;

	}
}
