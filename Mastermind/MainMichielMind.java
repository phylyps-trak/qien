package Mastermind;
/* 
 * 
 * Michiel Janssens
 * 16/02/2020
 * weekopdracht 2
 * Mastermind
 * 
 * Dankjewel Felix, voor je filmpjes. Beter goed jatten dan slecht zelf verzinnen.
 * (zie mijn vorige mastermind "Meestergeest"...)
 * 
 * TODO formaat KLEUREN en GEHEIMECODE en GOKJE dynamisch maken
 * 
 */

public class MainMichielMind {
//====================
	public static void main(String[] args) {
		Speler michiel = new Speler("Michiel", 0,0,10);
		SpelVerloop spel1 = new SpelVerloop();
		Robot robot = new Robot();
		
		/*
		int[] resultaten = robot.vergelijkDeGooi(michiel.gokje);
		michiel.setGoedCounter(resultaten[0]);
		michiel.setBijnaCounter(resultaten[1]);
		System.out.println("Je hebt er " + michiel.getGoedCounter() + " goed...");     
		System.out.println("Je hebt er " + michiel.getBijnaCounter() + " bijna goed...");
*/
		spel1.welkom();
		spel1.laatCodeZien(new Robot().robotCodeMaken() );
		spel1.eersteBeurt();
		while(michiel.turnCounter > 0 ) {
			michiel.doeEenGooi();
			robot.vergelijkDeGooi(michiel, michiel.gokje);
		}
	}//endof main
}//endofMichielmind
