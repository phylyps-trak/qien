package Piekenkermis;

public class Beheerder {
//======================================== METHODEN	
	void statusChecken(int j) {
		//zodat je 1 kan tiepen voor index0, en je 0 kan gebruiken voor EXIT
		if (j < 9 && j > 0) {
			j = j - 1;
			System.out.println(
					"::  -- STATUS:  " +
					Kermis.rides[j].getNaam());
			System.out.println(
					"::  # TICKETS:  " +
					Kermis.rides[j].getKaartjes());
			System.out.println(
					"::  Σ DONNIES:  " +
					Kermis.rides[j].berekenOmzet());
		} else if (j == 0) {
			System.out.println(
					"\033[3;31m <-- EXIT\033[0m");
			MainPiekenKermis.kapnah = 1;
		} else {
			System.out.println(
					"\033[3;31mDat is geen valide invoer...\033[0m");
		}
	}// endofstatusChecken

}//endofBeheerder
