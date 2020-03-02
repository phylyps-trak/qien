package Piekenkermis;

import Piekenkermis.Hawaii_4.RisicoException;

public class Bezoeker {
//======================================== METHODEN
	int kaartjekopen(int i) throws RisicoException {
		switch (i) {
		case 1:		Kermis.rides[0].draaien();	
		//botsautos
		break;
		case 2:		((Spin_1) Kermis.rides[1]).spinDraai();
		//spin
		break;
		case 3:  	Kermis.rides[2].draaien();
		//spiegelpaleis
		break;
		case 4:  	Kermis.rides[3].draaien();
		//spookhuis
		break;
		case 5:		((Hawaii_4) Kermis.rides[4]).hawaiiDraai();
		//hawaii
		break;
		case 6:		Kermis.rides[5].draaien();
		//ladderklimmen
		break;
		case 0:		System.out.println(
				"\033[3;31m <-- EXIT\033[0m\n");
					MainPiekenKermis.x.kapnah = 1;
		break;
		default: 	System.out.println(
				"\033[3;31mDat is geen valide invoer...\033[0m");
		break;
		}
		return i;
	}//endofkaartjekopen
}
