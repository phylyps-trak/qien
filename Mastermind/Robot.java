package Mastermind;

import java.util.Arrays;
import java.util.Random;
import Mastermind.Speler;

public class Robot {

	String[] kleuren = {"A","B","C","D","E","F","G","H"};
	String[] geheimeCode = new String[5];

//=============	
	public void robotCodeMaken() {
		for ( int x = 0 ; x < 5 ; x++ ) {
			Random r = new Random();
			int getal = r.nextInt(8);
		//trek vijf uit verzameling, stop in code
			geheimeCode[x] = kleuren[getal];
		}
	
	}//endof robotCodeMaken
	
	public String[] getRobotCode() {
		return geheimeCode;
	}
	
//======
	void vergelijkDeGooi(Speler s) {
		for (int i = 0 ; i < getRobotCode().length ; i++) {
			//aantal op de juiste plek tellen
			if (s.getGokje()[i].equals(geheimeCode[i])) {
				s.setGoedCounter(1);
			//aantal juiste letter tellen	
			}else if ( Arrays.asList(s.getGokje()).contains(geheimeCode[i]) ) {
				s.setBijnaCounter(1);
			}
		}
	// weergeven met fancy letters en kleurtjes
		System.out.print("\n\033[0;32m✔\033[0m  " + 
				s.getGoedCounter() +"\033[1;37m  goed, ");
		System.out.print(" \033[0;36m~\033[0m  " +
				s.getBijnaCounter() + "\033[1;37m bijna goed, ");
	// even de overgebleven fouten uitrekenen
		int temp = 5 - ( (s.getBijnaCounter()) + (s.getGoedCounter()) );
		System.out.print(" \033[0;31m✗\033[0m " +
				temp + "\033[1;37m compleet verkeerd... \033[0m");
	//beurt voorbij, print hoeveel nog te gaan
		s.turnCounter--;
		System.out.println("\033[3;90m\n(nog 9 beurten om de code te kraken!)\n\033[0m");                             	
	
	}//endof vergelijkDeGooi
}

