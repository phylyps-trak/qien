package Mastermind;

import java.util.Arrays;
import java.util.Random;
import Mastermind.Speler;

public class Robot {

	String[] kleuren = {
			"A",
			"B",
			"C",
			"D",
			"E",
			"F",
			"G",
			"H"};
	String[] geheimeCode = new String[5];

	//========	
	public void robotCodeMaken() {
		for ( int x = 0 ; x < 5 ; x++ ) {
			Random r = new Random();
			int getal = r.nextInt(8);
			geheimeCode[x] = kleuren[getal];
		}
	}//endof robotCodeMaken
	public String[] getRobotCode() {
		return geheimeCode;
	}
	//==========
	void vergelijkDeGooi(Speler s) {
		//helemaal goed
//do {
		

		for (int i = 0 ; i < getRobotCode().length ; i++) {
			//			System.out.println(">>DEBUG getGokje>> " + Arrays.toString(s.getGokje()));
			//			System.out.println(">>DEBUG robotCodeMaken>> " + Arrays.toString(getRobotCode()));
			if (s.getGokje()[i].equals(geheimeCode[i])) {
				s.setGoedCounter(1);
			}else if ( Arrays.asList(s.getGokje()).contains(geheimeCode[i]) ) {
				s.setBijnaCounter(1);
			}

		}
		System.out.print("\n\033[0;32m✔\033[0m  " + s.getGoedCounter() + "\033[1;37m  goed, ");
		System.out.print(" \033[0;36m~\033[0m  " + s.getBijnaCounter() + "\033[1;37m bijna goed, ");
		int temp = 5 - ( (s.getBijnaCounter()) + (s.getGoedCounter()) );
		System.out.print(" \033[0;31m✗\033[0m " + temp + "\033[1;37m compleet verkeerd... \033[0m");
		s.turnCounter--;
		System.out.println("\033[0;90m\n(...nog maar " + s.turnCounter + " beurten om de code te kraken!)\n\033[0m");
//}while  (!(Arrays.equals(s.getGokje(), geheimeCode))); 



		
		
	}//endof vergelijkDeGooi
}

/* OUWE VERSIE
 * if(s.getGokje()[i].equals(getRobotCode()[i])) {
				s.setGoedCounter(1);
				System.out.println("DEBUG");

				//bijna goed
				boolean a = Arrays.asList(s.getGokje()).contains(getRobotCode()[i]);
				if (a) {s.bijnaCounter++;}

			}else {
				System.out.println("...dat lijkt er helemáál niet op!");
			}
		}

 */




