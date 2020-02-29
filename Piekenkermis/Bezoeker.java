package Piekenkermis;

public class Bezoeker {


	int kaartjekopen(int i) {
		switch (i) {
		case 0:		Kermis.rides[0].draaien();	
		break;
		case 1:		Kermis.rides[1].draaien();
		break;
		case 2:  	Kermis.rides[2].draaien();			
		break;
		case 3:  	Kermis.rides[3].draaien();
		break;
		case 4:		Kermis.rides[4].draaien();
		break;
		case 5:		Kermis.rides[5].draaien();
		break;
		case 9:		System.out.println("\033[3;31m <-- EXIT\033[0m");
					MainPiekenKermis.go = 1;
		break;
		default: 	System.out.println("\033[3;31mDat is geen valide invoer...\033[0m");
		break;
		}
		return i;
	}//endofkaartjekopen
}
