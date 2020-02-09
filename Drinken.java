/*
 * Michiel Janssens
 * 08/02/2020
 * MINI opdracht
 * wie mag er zuipen opdrachtje: beter laat dan nooit
 * 
 * 
 * 
 */
import java.util.Scanner;
public class Drinken {
	public static void main(String[] args) {
		
	// 	welkom & intro
		//  AHA! dit laat de boel eindelijk zien...
		new Drinken().welkom();
		// VRAAG: hoe kan je de ddingen in welkom nog op een andere manier aanroepen?
		
		//leeftijd geven & teruggeven
		new Drinken().invoer();
		
		//leeftijdscheck & beoordeling

		new Drinken().checkLeeftijd();
				

	}//endofmain


	

//=========================INFRASTRUCTUUR HIERONDER========================
static int leeftijd;
	
void welkom() {
	System.out.println("Welkom bij Jaap Zatlap, uw vertrouwde slijter");
	System.out.println("#############################################\n");
	System.out.println("Helaasch moeten ook wij ons aan de wet houden,\nvandaar de volgende huisregels:");
	System.out.println(" ------------------------------------------- ");
	System.out.println("|  ben jij:                                 |");
	System.out.println("|   jonger dan 16:  geen alcohol        :(  |");
	System.out.println("|   16 of 17:       bier fris wijn      ;)  |");
	System.out.println("|   18 of ouder:    zuip je de cirrose! :p  |");
	System.out.println(" ------------------------------------------- \n\n");
}//endofwelkom


public int invoer() {
	//scanner (constructor? is dit juist gezegd?)
		Scanner sc = new Scanner(System.in);
		
	// scanner 
		System.out.println("vul hier je leeftijd in:");
			
	// invulveld voor leeftijd koper & maak van de input een integer
		int leeftijd = Integer.parseInt(sc.nextLine()); 
	// print invoer terug naar console
		System.out.println("Je beweert dat jouw leeftijd " + leeftijd + " is...\n\n");
	// close the scanner, want daar zeurt Eclipse om    
	      sc.close();
	// zorg dat de leeftijd bereikbaar is voor andere methods      
		return leeftijd;
}//endofinvoer


	//deze hoeft alleen maar te printen, dus heeft geen returntype
public void checkLeeftijd() {
		int lft = leeftijd;
		int a = 16;
		int b = 17;

		//WAAROM WERKT MIJN IFGEBEURN NIET????
		
		if (lft < a) {
		        System.out.println("Nee gek, je krijg hemaal niks!");
		    }else if(lft > b){
		        System.out.println("Voledige vergunning voor jou!");
		    }else {
		        System.out.println("Nou vooruit, een biertje ofzo dan.");
		    }
				System.out.println("Bedankt en nou opzouten.");
}//endofleeftijd

}//endofDrinken

	

