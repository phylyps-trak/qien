/*
 * Michiel Janssens
 * 08/02/2020
 * MINI opdracht
 * wie mag er zuipen opdrachtje: beter laat dan nooit
 * 
 * 15/02 laatste versie: 
 * eindelijk het doorgeven van de waarde van leeftijd netjes gekregen.
 * Zonder clas "Koper" werd het allemaal een beetje lastig...
 * 
 */
import java.util.Scanner;

public class Drinken {
	public static void main(String[] args) {
	//op een dag komt Klaas de slijterij binnen...
		Koper klaas = new Koper();
	// 	welkom & intro
	//  AHA! dit laat de boel eindelijk zien...
		Slijter.welkom();
	// VRAAG: hoe kan je de ddingen in welkom nog op een andere manier aanroepen?
		
	//leeftijd geven & teruggeven
		klaas.invoer();
		
	//leeftijd checken
		Slijter.checkLeeftijd(klaas.getter());
		
	//zo kan i als leeftijd NIET private is:
	//	Slijter.checkLeeftijd(klaas.leeftijd);
				

	}//endofmain
}//endofDrinken

//================INFORMATIE INFRASTRUCTUUR HIERONDER========================
class Koper {
// want elke koper heeft een leeftijd
	private int leeftijd;
//nu netjes encapsulated, vandaard de getter methode op r51

//vraag-om-leetijd-methode
	public void invoer() {
	//scanner instantieren
		String s = "Tiep dat hier maar eens...";
		Scanner sc = new Scanner(s);	
	// vraag om leeftijd
		System.out.println("Zeg jongeman, hoe oud ben jij eigenlijk?:");		
	// invulveld voor leeftijd koper & maak van de input een integer
		//this. stopt het in de class z'n field (e.g. mijn.leeftijd...)
		this.leeftijd = Integer.parseInt(sc.nextLine()); 
	// print invoer terug naar console
		System.out.println("...en jij beweert dat jouw leeftijd " + leeftijd + " is!?\n\n");	
	}
//
	public int getter() {
		return leeftijd;
	}
}//endofkoper
	
class Slijter {
	static void welkom() {
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

	//deze hoeft alleen maar te printen, dus heeft geen returntype
	public static void checkLeeftijd(int lft) {
		//ijkpuntleeftijden
			int a = 16;
			int b = 17;
		//WAAROM WERKT MIJN IFGEBEURN NIET????
		//dat was omdat ik de leeftijd niet netjes doorgaf
			
			if (lft < a) {
			        System.out.println("Nee gek, je krijg hemaal niks!\n");
			    }else if(lft > b){
			        System.out.println("Voledige vergunning voor jou!\n");
			    }else {
			        System.out.println("Nou vooruit, een biertje ofzo dan\n.");
			    }
					System.out.println("Bedankt en nou opzouten.\n");
	}//endofleeftijd
}//endofslijter

	

