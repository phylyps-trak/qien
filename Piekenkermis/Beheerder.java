package Piekenkermis;

public class Beheerder {
//======================================== METHODEN	
	void statusChecken(int j) {
		if (j < 9) {
			System.out.println(
					"::  -- STATUS:  " +
					Kermis.rides[j].getNaam());
			System.out.println(
					"::  # TICKETS:  " +
					Kermis.rides[j].getKaartjes());
			System.out.println(
					"::  Σ DONNIES:  " +
					Kermis.rides[j].berekenOmzet());
		} else if (j == 9) {
			System.out.println(
					"\033[3;31m <-- EXIT\033[0m");
			MainPiekenKermis.kapnah = 1;
		} else {
			System.out.println(
					"\033[3;31mDat is geen valide invoer...\033[0m");
		}
	}// endofstatusChecken

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
	}//endofgetTotaalKaartjes

}//endofBeheerder
