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
 */
import java.util.Random;
import java.util.Scanner;

public class Michielmind {
//====================
	public static void main(String[] args) {
		Speler michiel = new Speler();
		SpelVerloop spel1 = new SpelVerloop();

		spel1.welkom();
		spel1.laatCodeZien( robotCodeMaken() );
		spel1.eersteBeurt();
		michiel.doeEenGooi();	
		michiel.vergelijkDeGooi(michiel.geefGokDoor());
		while(michiel.turnCounter > 0 ) {
			michiel.doeEenGooi();
			michiel.vergelijkDeGooi(michiel.geefGokDoor());
		}
	}//endof main
	static String[] kleuren = {"A","B","C","D","E","F","G","H"};
	static String[] geheimeCode = new String[5];
//========	
	static String[] robotCodeMaken() {
		for ( int x = 0 ; x < 5 ; x++ ) {
			Random r = new Random();
			int getal = r.nextInt(8);
			geheimeCode[x] = kleuren[getal];
		}
		return geheimeCode;
	}//endof robotCodeMaken



//##############
	static class Speler{
		// TODO dynamische naamgeving
		String naam;
		// tellertjes
		static int goedCounter;
		static int bijnaCounter;
		int turnCounter = 10;
		// dit is de array waar de input in moet
		private String[] gokje = new String[5];
//==========			// speler doet een poging		
		void doeEenGooi() {
			Scanner in = new Scanner(System.in);
			System.out.print("-> ");	String line = in.nextLine(); 
			//hak de input in stukjes bij de komma, maak hoofdletters van, stop in arra
			gokje = line.toUpperCase().split(",");
			System.out.print("\n |");
			for(String s: gokje)
				System.out.print(" " + s +" |");
			System.out.println(" ");
			//DEBUG
			//System.out.println("DEBUG gokje: " + (Arrays.toString(gokje)));

		}//endof doeEenGooi

		//GETTER method
		String[] geefGokDoor() {
			String [] poging = new String[5];
			poging = gokje;
			return poging;
		}
//==========
		void vergelijkDeGooi(String[] gc) {
			//doorloop dit if statement voor elk van de vijf posities in gokje
			if(geheimeCode[0].equals(gc[0])) {
				goedCounter++;
				System.out.println("Je hebt er " + goedCounter + " goed...");
			}else if ( geheimeCode[0].equals(gc[1]) || geheimeCode[0].equals(gc[2])
					|| geheimeCode[0].equals(gc[3]) || geheimeCode[0].equals(gc[4]) ){
				bijnaCounter++;
				System.out.println("Je hebt er " + bijnaCounter + " bijna goed...");
				 
			}else {
				System.out.println("...dat lijkt er helemáál niet op!");
			}
		
			turnCounter--;
			System.out.println("(Oh nee! Je hebt nog maar " + turnCounter + " beurten om de code te kraken!)");
		}//endof vergelijkDeGooi

		/*		//NIEUWE POGING VERGELIJKCHECKER
		String checkOfGoed(String a) {
			if(a.contentEquals(geheimeCode[0])) {
			}return "Je hebt er 1 goed";
		}
		 */		
	}//endof Speler
	
//##########################
	static class SpelVerloop{

//=================			//INTRO hahah lekker ascii klooien, heerlijk
		void welkom() {
			System.out.println("######################################");
			System.out.println("    Welkom bij MOMIND superieur");
			System.out.println("  ----------------------------------- ");
			System.out.println(" |   Het bekroonde spel voor de      |");
			System.out.println(" |   professionele codebrekers       |");
			System.out.println(" |     Le jeu champion pour les      |");
			System.out.println(" |     professionels du decodage     |");
			System.out.println("    -------------------------------   ");
			System.out.println(" |   met 5 gaten en 8 kleuren        |");
			System.out.println(" |     avec 5 cases et 8 couleurs    |");
			System.out.println("  ----------------------------------- ");
			System.out.println("                                      ");
			System.out.println(" ------ Spel van het jaar 1975! ------");
			System.out.println("######################################");
			System.out.println("\n");
		}//endofwelkom

//==========				//extra methodetje om de gevulde codearray netjes te laten zien
		void laatCodeZien( String[] codeArray){
			System.out.println("   [de geheime code]");
			System.out.println("  -------------------");
			for(int a = 0 ; a < codeArray.length ; a++ ){
				System.out.print(" | " + codeArray[a] );
			}
			System.out.print(" |");
			System.out.println(" ");			
			System.out.println("  -------------------");

		}//endof laatCodeZien
//==========
		void eersteBeurt() {
			//eerste beurt

			System.out.println("\n...en nu jij, raden maar!  (format: x,x,x,x,x)");
			System.out.println("=======================");
		}
	}//endofSpelVerloop

}//endofMichielmind
