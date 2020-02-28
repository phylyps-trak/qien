package Piekenkermis;

public class Beheerder {
	void statusChecken(int j) {
		switch (j) {
		case 0:		System.out.println("-----STATUS:  De Botsauto's");
					System.out.println("--# TICKETS:  " + Kermis.rides[0].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[0].berekenOmzet());
		break;
		case 1:  	System.out.println("-----STATUS:  De Spin");
					System.out.println("--# TICKETS:  " + Kermis.rides[1].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[1].berekenOmzet());
		break;
		case 2:  	System.out.println("-----STATUS:  Het Spiegelpaleis");
					System.out.println("--# TICKETS:  " + Kermis.rides[2].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[2].berekenOmzet());
		break;
		case 3:  	System.out.println("-----STATUS:  Spookhuis");
					System.out.println("--# TICKETS:  " + Kermis.rides[3].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[3].berekenOmzet());
		break;
		case 4:		System.out.println("-----STATUS:  Hawaii");
					System.out.println("--# TICKETS:  " + Kermis.rides[0].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[0].berekenOmzet());
		break;
		case 5:		System.out.println("-----STATUS:  Ladderklimmen");
					System.out.println("--# TICKETS:  " + Kermis.rides[0].k.getKaartjes());
					System.out.println("--Σ DONNIES:  " + Kermis.rides[0].berekenOmzet());
		break;
		case 9:		
		default: 	System.out.println("\033[3;31mEXIT\033[0m");
		break;
		}
	}//endofstatusChecken
}
