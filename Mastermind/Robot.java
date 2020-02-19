package Mastermind;

import java.util.Arrays;
import java.util.Random;
import Mastermind.Speler;

public class Robot {
	String[] kleuren = {"A","B","C","D","E","F","G","H"};
	String[] geheimeCode = new String[5];

	//========	
	public String[] robotCodeMaken() {
		for ( int x = 0 ; x < 5 ; x++ ) {
			Random r = new Random();
			int getal = r.nextInt(8);
			geheimeCode[x] = kleuren[getal];
		}
		return geheimeCode;

	}//endof robotCodeMaken
	//==========
	void vergelijkDeGooi(Speler s) {
		//helemaal goed
		for (int i = 0 ; i < geheimeCode.length ; i++) {
			if(geheimeCode[i].equals(s.gokje[i])) {
				s.setGoedCounter(1);

				boolean a = Arrays.asList(s.gokje).contains(geheimeCode[i]);
				if (a)s.bijnaCounter++;

			}else {
				System.out.println("...dat lijkt er helemáál niet op!");
			}
		}
		System.out.println("Je hebt er " + s.getGoedCounter() + " goed...");
		System.out.println("Je hebt er " + s.getBijnaCounter() + " bijna goed...");
		s.turnCounter--;
		System.out.println("(Oh nee! Je hebt nog maar " + s.turnCounter + " beurten om de code te kraken!)");

		//boolean contains = Arrays.stream(gokje).anyMatch(geheimeCode[0]::equals);
		//System.out.println("DEBUG2 " + contains + "\n");
	}
}//endof vergelijkDeGooi
