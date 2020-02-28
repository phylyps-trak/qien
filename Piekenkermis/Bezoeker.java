package Piekenkermis;

public class Bezoeker {

	
	int kaartjekopen(int i) {
		switch (i) {
		case 0:		System.out.println("De Botsauto's");
						Kermis.rides[0].draaien();	
					System.out.println("DEBUG");
					System.out.println(Kermis.rides[0].getKaartjes());
					break;
		case 1:  	System.out.println("De Spin");
						Kermis.rides[1].draaien();
					break;
		case 2:  	System.out.println("Het Spiegelpaleis");
						Kermis.rides[2].draaien();			
					break;
		case 3:  	System.out.println("Het Spookhuis");
						Kermis.rides[3].draaien();
					break;
		case 4:		System.out.println("Hawaii");
						Kermis.rides[4].draaien();
					break;
		case 5:		System.out.println("Ladderklimmen");
						Kermis.rides[5].draaien();
		break;
		default: 	System.out.println("\033[3;31mDat is geen valide keuze...\033[0m");
					System.out.println("|033[3;90m---------------------------\033[0m");
		}
	return i;
	}//endofkaartjekopen
}
