package Piekenkermis;

public class Ladderklimmen_5 extends Attractie implements GokAttractie{

	Ladderklimmen_5(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
	}

	public double kansspelBelasting() {
		Kermis.rides[5].berekenOmzet();
		double belasting_5 = getOmzet()* 0.3;

		setOmzet(getOmzet() - belasting_5);
		System.out.println("DEBUG nieuwe omzet" + omzet);
		return belasting_5;
	}
}
