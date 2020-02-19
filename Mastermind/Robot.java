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

}//==========
	void vergelijkDeGooi(String[] gc) {
		//helemaal goed
		if(geheimeCode[0].equals(gc[0])) {
			Speler.setGoedCounter(Speler.getGoedCounter() + 1);
		}else if(geheimeCode[1].equals(gc[1])) {
			Speler.setGoedCounter(Speler.getGoedCounter() + 1);
		}else if(geheimeCode[2].equals(gc[2])) {
			Speler.setGoedCounter(Speler.getGoedCounter() + 1);
		}else if(geheimeCode[3].equals(gc[3])) {
			Speler.setGoedCounter(Speler.getGoedCounter() + 1);
		}else if(geheimeCode[4].equals(gc[4])) {
			Speler.setGoedCounter(Speler.getGoedCounter() + 1);
		System.out.println("Je hebt er " + Speler.getGoedCounter() + " goed...");	 
		}else {
			System.out.println("...dat lijkt er helemáál niet op!");
		}
	
		Speler.turnCounter--;
		System.out.println("(Oh nee! Je hebt nog maar " + turnCounter + " beurten om de code te kraken!)");
		
		boolean a = Arrays.asList(gokje).contains(geheimeCode[0]);
		if (a)bijnaCounter++;
		boolean b = Arrays.asList(gokje).contains(geheimeCode[1]);
		if (b)bijnaCounter++;
		boolean c = Arrays.asList(gokje).contains(geheimeCode[2]);
		if (c)bijnaCounter++;
		boolean d = Arrays.asList(gokje).contains(geheimeCode[3]);
		if (d)bijnaCounter++;
		boolean e = Arrays.asList(gokje).contains(geheimeCode[4]);
		if (e)bijnaCounter++;
	
		System.out.println("DEBUG1 " + a +  b + c + d + e +"\n");
		System.out.println("Je hebt er " + Speler.getBijnaCounter() + " bijna goed...");
		//boolean contains = Arrays.stream(gokje).anyMatch(geheimeCode[0]::equals);
		//System.out.println("DEBUG2 " + contains + "\n");

	}//endof vergelijkDeGooi
}
