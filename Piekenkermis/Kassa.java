package Piekenkermis;

public class Kassa {
	
	private double to = 0;
	private int kassaTotaalKaartjes = getTotaalKaartjes();
	Kermis kermis;
	
	Kassa(Kermis q){
		this.kermis = q;
	}
	
	void berekenTotaalOmzet() {
		for (Attractie x : kermis.rides) {
			to = to + x.berekenOmzet();
		}
	}//endofgetTotaalOmzet
	
	double getTotaalOmzet() {
		return to;
	}

	int getTotaalKaartjes() {
		int tk = 0;
		for (Attractie x : kermis.rides) {
			tk = tk + x.getKaartjes();
		}
		return tk;
	}

}
