package Piekenkermis;

public class Bezoeker {

	
	int kaartjekopen(int i) {
		switch (i) {
		case 0:		System.out.println("De Botsauto's");
					Kermis.rides[0].draaien();
						
					Kermis.rides[0].k.setKaartjes( Kermis.rides[0].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
					break;
		case 1:  	System.out.println("De Spin");
						Kermis.rides[1].draaien();
						Kermis.rides[1].k.setKaartjes( Kermis.rides[1].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
					break;
		case 2:  	System.out.println("Het Spiegelpaleis");
						Kermis.rides[2].draaien();			
						Kermis.rides[2].k.setKaartjes( Kermis.rides[2].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
					break;
		case 3:  	System.out.println("Het Spookhuis");
						Kermis.rides[3].draaien();
						Kermis.rides[3].k.setKaartjes( Kermis.rides[2].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
					break;
		case 4:		System.out.println("Hawaii");
						Kermis.rides[4].draaien();
						Kermis.rides[4].k.setKaartjes( Kermis.rides[2].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
					break;
		case 5:		System.out.println("Ladderklimmen");
						Kermis.rides[5].draaien();
						Kermis.rides[5].k.setKaartjes( Kermis.rides[5].k.getKaartjes()+1 );
					System.out.println("Veel plezier!");
		break;
		default: 	System.out.println("\033[3;31mDat is geen valide keuze...\033[0m");
		}
	return i;
	}//endofkaartjekopen
}
