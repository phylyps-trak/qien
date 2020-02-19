package Mastermind;

import java.util.Arrays;
import java.util.Random;
import Mastermind.Speler;

public class Robot {
	String[] kleuren = {"A","B","C","D","E","F","G","H"};
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
		for (int i = 0 ; i < getRobotCode().length ; i++) {
//			System.out.println(">>DEBUG getGokje>> " + Arrays.toString(s.getGokje()));
//			System.out.println(">>DEBUG robotCodeMaken>> " + Arrays.toString(getRobotCode()));
			if (Arrays.equals(s.getGokje(), geheimeCode)) {
				System.out.println(" *** Dikke gefeli, ouwe, je heb gewonne! *** ");
			break;	
			}else if(s.getGokje()[i].equals(geheimeCode[i])) {
				  s.setGoedCounter(1);
				}
				else if ( Arrays.asList(s.getGokje()).contains(geheimeCode[i]) ) {
				  s.setBijnaCounter(1);
				} else {
				    System.out.println("...dat lijkt er helemáál niet op!");
				}
			
		}
			
		System.out.println("\nJe hebt er " + s.getGoedCounter() + " goed...");
		System.out.println("Je hebt er " + s.getBijnaCounter() + " bijna goed...");
		s.turnCounter--;
		System.out.println("(Oh nee! Je hebt nog maar " + s.turnCounter + " beurten om de code te kraken!)");

	
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




