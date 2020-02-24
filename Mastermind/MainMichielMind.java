package Mastermind;

import java.util.Arrays;

/* 
 * 
 * Michiel Janssens
 * 16/02/2020
 * weekopdracht 2
 * Mastermind
 * 
 * 24/2
 * TODO formaat KLEUREN en GEHEIMECODE en GOKJE dynamisch maken
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
		spel1.laatCodeZien(robot.getRobotCode() );
		spel1.eersteBeurt();
		//spel
		while(!(michiel.turnCounter < 0) && !((Arrays.equals(michiel.getGokje(), robot.geheimeCode))) ) {
             michiel.reset();
             michiel.doeEenGooi();
			 robot.vergelijkDeGooi(michiel);	
		}
		//verliezen of winnen
		if (michiel.turnCounter <= 1 ) {
			System.out.println("\033[1;31mDat is jammer, je hebt alle pogingen gebruikt,\033[0m");
			System.out.println("\033[1;31mmaar de code niet gekraakt...\033[0m");
		}else if(michiel.goedCounter == 5) {
			System.out.println("\n\033[1;31m *** Dikke gefeli, ouwe, je heb gewonne! *** \033[0m");
		}
		
		
		} while (spel1.stopDoor().equals("j"));
			
		
		
		
		/*
		int[] resultaten = robot.vergelijkDeGooi(michiel.gokje);
		michiel.setGoedCounter(resultaten[0]);
		michiel.setBijnaCounter(resultaten[1]);
		System.out.println("Je hebt er " + michiel.getGoedCounter() + " goed...");     
		System.out.println("Je hebt er " + michiel.getBijnaCounter() + " bijna goed...");
*/
	}//endof main
}//endofMichielmind
