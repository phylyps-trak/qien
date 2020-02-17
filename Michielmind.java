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

		// TODO welkom en uitleg
		SpelVerloop.welkom();
		System.out.println("\n");

		//??VRAAG: kan dit makkelijker??
		new SpelVerloop().laatCodeZien(new SpelVerloop().robotCodeMaken());
		//eerste beurt
		System.out.println("=======================");
		System.out.println("...en nu jij, raden maar!\n");
		System.out.println("(Type je letters gescheiden door een komma)");

		new Speler().doeEenGooi();
		new Speler().vergelijkDeGooi();
		/*
		//alle volgende beurten, tot max. 10 keer		
		while(Speler.turnCounter < 10 ) {
			System.out.println(" niet helemaal goed, nog eens:\n");
			new Speler().doeEenGooi();
			new Speler().vergelijkDeGooi();
		}
*/



		// TODO GOOGLEN hoe je ze vergelijk, de karakters

		// TODO punt geven als gelijk
		// TODO geen punt als i goed
		//=================
		// nu proberen met twee karakters computer code
		// met if statement & for loop	
	}//endof main
	//##############
	static class Speler{
		// TODO dynamische naamgeving
		String naam;
		static int goedCounter;
		static int bijnaCounter;
		//beurtenteller
		static int turnCounter = 0;
		//dit is de array waar de input in moet
		static String[] gokje = new String[5];
		//==========			// speler doet een poging		
		void doeEenGooi() {
			Scanner in = new Scanner(System.in);
			System.out.print("-> ");	String line = in.nextLine(); 
			//hak de input in stukjes bij de komma, maak hoofdletters van, stop in arra
			String[] gokje = line.toUpperCase().split(",");
			System.out.print(" |");
			for(String s: gokje)
				System.out.print(" " + s +" |");

		}//endof doeEenGooi
		
		void vergelijkDeGooi() {
			//doorloop dit if statemen voor elk van de vijf posities in gokje
			if( gokje[0].equals(SpelVerloop.geheimeCode[0])) {
				goedCounter++;
				System.out.println("Je hebt er " + goedCounter + "goed");
			}else if ( gokje[0].equals(SpelVerloop.geheimeCode[ 1 | 2 | 3 | 4] )) {
				bijnaCounter++;
				System.out.println("Je hebt er " + bijnaCounter + "bijna");
			}else {
				System.out.println("Dat lijkt er helemaal niet op...");
			}
			turnCounter++;
		}//endof vergelijkDeGooi

	}//endof Speler
	//##########################
	static class SpelVerloop{
		String[] kleuren = {"A","B","C","D","E","F","G","H"};
		static //de geheime code moet hier in
		String[] geheimeCode = new String[5];

		//=================			//INTRO hahah lekker ascii klooien, heerlijk
		static void welkom() {
			System.out.println("######################################");
			System.out.println("    Welkom bij MASTERMIND superieur");
			System.out.println("  ----------------------------------- ");
			System.out.println(" |  Het bekroonde spel voor de       |");
			System.out.println(" |  professionele codebrekers        |");
			System.out.println(" |  Le jeu champion pour             |");
			System.out.println(" |  les professionels du decodage    |");
			System.out.println("    -------------------------------   ");
			System.out.println(" |  met 5 gaten en 8 kleuren         |");
			System.out.println(" |  avec 5 cases et 8 couleurs       |");
			System.out.println("  ----------------------------------- ");
			System.out.println("      (up to 32000 permutations)      ");
			System.out.println(" ------ Spel van het jaar 1975! ------");
			System.out.println("######################################");

		}//endofwelkom
		//==============			//BASIS ARRAY, 4 random uit halen -> code array
		String[] robotCodeMaken() {


			for ( int x = 0 ; x < 5 ; x++ ) {
				Random r = new Random();
				int getal = r.nextInt(8);
				geheimeCode[x] = kleuren[getal];
			}
			return geheimeCode;
		}//endof robotCodeMaken
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

	}//endofSpelVerloop

}//endofMichielmind
