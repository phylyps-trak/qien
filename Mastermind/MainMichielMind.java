package Mastermind;

import java.util.Arrays;

/* 
 * 
 * Michiel Janssens
 * 16/02/2020
 * weekopdracht 2
 * Mastermind
 * 
 * 
 * TODO formaat KLEUREN en GEHEIMECODE en GOKJE dynamisch maken
 * TODO dynamische naamgeving speler
 * TODO methodes doeEenGooi & vergelijkDeGooi in kleinere stukjes knippen
 * 24/02/20
 * Leuke dingen die ik heb geleerd hier van:
 * - dingetje bouwen in meerdere .class files.
 * - verschillende soorten loops en ifs gebruiken om de volgorde netjes te laten gaan
 * - arrays maken & uitlezen
 * - verschillende manier gebruiken om de inhoud van arrays met elkaar te vergelijken
 * - String methoden gebruiken (toUpperCase, split)
 * - veel gepruts met getters en setters
 * - lekker gespeeld met ASCII en kleurtjes
 * - eindeloos geoefend met scanner recht krijgen
 * - om de string input op format te checken gebruik gemaakt van Pattern/Matcher.
 * 
 */

public class MainMichielMind {
//====================
	public static void main(String[] args) {
		
	//setup dingen, TODO: later dynamisch maken
		Speler michiel = new Speler("Michiel", 0,0,10);
		SpelVerloop spel1 = new SpelVerloop();
		Robot robot = new Robot();

	//do while, zodat je kan herstarten als je wil  	
		do {
	//meer setup
		robot.robotCodeMaken();
		spel1.welkom();
		spel1.laatCodeZien( robot.getRobotCode() );
		spel1.eersteBeurt();
	//spel
		while 	(!(michiel.turnCounter < 0) &&
				!((Arrays.equals(michiel.getGokje(), robot.geheimeCode))) ) {
             michiel.reset();
             michiel.doeEenGooi();
			 robot.vergelijkDeGooi(michiel);	
		}
	//verliezen of winnen
		if (michiel.turnCounter <= 1 ) {
			System.out.println(
					"\033[1;31mDat is jammer, je hebt alle pogingen gebruikt,\033[0m");
			System.out.println(
					"\033[1;31mmaar de code niet gekraakt...\033[0m");
		}else if(michiel.goedCounter == 5) {
			System.out.println("\n\033[1;31m *** Dikke gefeli, ouwe, je heb gewonne! *** \033[0m");
		}
	//DOORGAAN!!
		} while (spel1.stopDoor().equals("j"));
			

	}//endof main
}//endofMichielmind
