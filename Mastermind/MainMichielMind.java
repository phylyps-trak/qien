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
		Speler michiel = new Speler();
		SpelVerloop spel1 = new SpelVerloop();
		Robot robot = new Robot();

		spel1.welkom();
		spel1.laatCodeZien(new Robot().robotCodeMaken() );
		spel1.eersteBeurt();
		while(michiel.turnCounter > 0 ) {
			michiel.doeEenGooi();
			robot.vergelijkDeGooi(michiel.geefGokDoor());
		}
	}//endof main
}//endofMichielmind
