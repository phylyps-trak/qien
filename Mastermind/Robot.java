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
	void vergelijkDeGooi(String[] gc, Speler s) {
		//helemaal goed
		for (int i = 0 ; i < gc.length ; i++) {
		if(geheimeCode[i].equals(gc[i])) {
			s.setGoedCounter(1);
			
		System.out.println("Je hebt er " + s.getGoedCounter() + " goed...");	 
		}else {
			System.out.println("...dat lijkt er helemáál niet op!");
		}
	}

		for (int i = 0 ; i < gc.length ; i++) {
		boolean a = Arrays.asList(s.gokje).contains(geheimeCode[i]);
		if (a)s.bijnaCounter++;
		s.turnCounter--;
		System.out.println("(Oh nee! Je hebt nog maar " + s.turnCounter + " beurten om de code te kraken!)");
		System.out.println("Je hebt er " + s.getBijnaCounter() + " bijna goed...");
		//boolean contains = Arrays.stream(gokje).anyMatch(geheimeCode[0]::equals);
		//System.out.println("DEBUG2 " + contains + "\n");
		}
	}//endof vergelijkDeGooi
}
