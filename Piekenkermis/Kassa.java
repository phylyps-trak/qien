package Piekenkermis;

public class Kassa {
	
	private double kassaTotaalOmzet = getTotaalOmzet();
	private int kassaTotaalKaartjes = getTotaalKaartjes();
	
	
	double getTotaalOmzet() {
		double to = 0;
		for (Attractie x : Kermis.rides) {
			to = to + x.berekenOmzet();
		}
		return to;
	}//endofgetTotaalOmzet

	int getTotaalKaartjes() {
		int tk = 0;
		for (Attractie x : Kermis.rides) {
			tk = tk + x.getKaartjes();
		}
		return tk;
	}

}
