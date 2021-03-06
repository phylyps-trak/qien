/*	26/02/2020
 * 	Michiel Janssens
 * 	De Pieken Kermis
 *  ----------------
 *  volgens weekopdracht 2
 * 
 * 	dingen die geleerd zijn:
 * 	- overerfde methode netjes doen
 * 	- DecimalFormat voor weergave prijzen
 * 	- for en while loopjes zo economisch mogelijk maken
 *  - lekker door de objectarrays heenlopen & methoden roepen 
 *  - switchen tussen ene en andere modus van user invoer met KAPNAH
 *  - uitgevonden dat je TEGELIJK de returnwaarde van een methode 
 *  in een var kan opslaan, EN de methode kan uitvoeren... (39)
 * 
 * VRAAG: hoe kan ik de Belastinginspecteur de juiste attracties eruit laten pikken? (methode heffen)
 * VRAAG: hoe moet ik de abstracte class juist gebruiken? Ze zijn nu eigenlijk individueel
 * VRAAG: ik weet niet hoe je op een handige manier die exceptions in je structuur bouwt.
 * 
 * VRAAG ik wil al die functionalisteit UIT de static context slopen, en in objecten stoppen.
 * Hoe pak je dat aan? Hoe kan ik dat hier achteraf inregelen?
 * 
 * VRAAG: regel 107 +/-
 * 
 * TODO abstracte clss risicoattr netjes implementeren: de attr zelf werken wel, 
 * maar had net zo goed zonder die abstracte gekund...
 * 
 * TODO enkele dingen uit de mainbeheerder methode op een andere plek, of als USER O & K ingeeft
 * 
 * TODO kassa object toch maar maken, misschien met kopieen van alle nu rondzwervende waarden?
 * 
 * TODO zorgen dat foutieve input in keuzemenu beter wordt opgevangen
 * 
 * TODO spindraai en hawaiidraai moeten vervangen voor dynamysche methoden via risicoattractie
 */
package Piekenkermis;

import java.util.Scanner;

public class MainPiekenKermis {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Bezoeker felix = new Bezoeker();
	Beheerder johan = new Beheerder();
	BelastingInspecteur jos = new BelastingInspecteur();
	Monteur michiel = new Monteur();
	static Kassa k = new Kassa(); //de kassa mag stiticx zijn, omdat i voor iedereen bereikbaar niet zijn
	//switch tussen gebruikers met deze
	int kapnah = 0;
	
//======================================== MAIN
	public static void main(String[] args) {
	
	MainPiekenKermis x = new MainPiekenKermis();
	
		x.welkom();
	  
		int modus = x.kiesModus();

		while (true) {
			if ( x.kapnah == 1 ) {
			  modus = x.kiesModus();
			  x.kapnah = 0;
			}
			if ( 0 == modus ) {		//YODACODE!
				x.mainBezoeker();
			} else if ( 1 == modus ) {
				x.mainBeheerder();
			}
		}
	}// endofmain
	
//======================================== METHODEN	
	int kiesModus() {
		while (true) {
			System.out.print(
					"\033[3;90m( bezoekers: b --- beheerder: B ) --> \033[0m");
			String access = sc2.nextLine();
			System.out.println(
					"\033[3;90m----------------------"
					+ "( EXIT: 0 )-----------------\033[0m");

			if (access.contentEquals("b")) {
				return 0;
			} else if ( access.contentEquals("B")) {
				return 1;
			} else {
				System.out.println(
						"\033[1;33m----> Jij heb er een teveel op, "
						+ "ga maar naar huis!\033[0m\n");		
			}
		}
	}//endofkiesmodus	
	
	
	void mainBezoeker() {
		System.out.print(
				"\n:: \033[4;37mKoop hier uw kaartjes!\033[0;m :: attr #: ");
		int input;
		try {
		input = Integer.parseInt(sc.nextLine());
		felix.kaartjekopen(input);
		}catch (Exception e) {
			System.out.print(
					"\033[0;101m Draailimiet bereikt, "
							+ "bel snel de monteur voor controle!\n (type \"ok\")-->: \033[0m");
			if (sc.nextLine().equals("ok")){
				michiel.onderhoudsbeurt(null);  
				//hoe krijg ik hier een referentie in naar de risicoattractie die de excetion heft gethrowed?
			}
		}
	}// endofMainBezoeker
	
	
	void mainBeheerder() {
		if ( (k.getTotaalKaartjes()) > 15 ){
			jos.inspecteurOpJeDak();
		}else {
		System.out.println(
				"\n::  ------- totaal omzet: ƒ " +
						Attractie.df.format(k.getTotaalOmzet()));
		System.out.println(
				"::  ---- totaal kaartjes: " +
				k.getTotaalKaartjes());
		System.out.print(
				"\n:: Kies attractie voor status -->");

		int input = Integer.parseInt(sc.nextLine());
		johan.statusChecken(input);
		}
	}// endofMainBeheerder	

	
	void welkom() {
		System.out.println("\n");
		System.out.println("   ************************");
		System.out.println("   **\033[1m  de PIEKEN KERMIS\033[0m  **");
		System.out.println("   **  ---\033[3;37msinds 1989\033[0m---  **");
		System.out.println("   ************************ \n");
		System.out.println(
				"...\033[1m1\033[0m..botsauto's...\033[1m2\033[0m..spin.....\033[1m3\033[0m..spiegelpaleis...\n"
						+ "...\033[1m4\033[0m..spookhuis....\033[1m5\033[0m..hawaii...\033[1m6\033[0m..ladderklimmen...\n"
						+ "\033[3;90m--------------------------------------------------");
	}
}// endofMainPiekenKermis
