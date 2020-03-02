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
<<<<<<< HEAD
 * VRAAG: hoe kan ik de Belastinginspecteur de juiste attracties eruit laten pikken? (methode heffen)
 * VRAAG: hoe moet ik de abstracte class juist gebruiken? Ze zijn nu eigenlijk individueel
 * VRAAG: ik weet niet hoe je op een handige manier die exceptions in je structuur bouwt.
 * 
 * VRAAG ik wil al die functionalisteit UIT de static context slopen, en in objecten stoppen.
 * Hoe pak je dat aan? Hoe kan ik dat hier achteraf inregelen?
=======
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
 * 
 * TODO abstracte clss risicoattr netjes implementeren: de attr zelf werken wel, 
 * maar had net zo goed zonder die abstracte gekund...
 * 
 * TODO enkele dingen uit de mainbeheerder methode op een andere plek, of als USER O & K ingeeft
 * 
 * TODO kassa object toch maar maken, misschien met kopieen van alle nu rondzwervende waarden?
<<<<<<< HEAD
 * 
 * TODO zorgen dat foutieve input in keuzemenu beter wordt opgevangen
=======
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
 */
package Piekenkermis;

import java.util.Scanner;

public class MainPiekenKermis {
	
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Bezoeker felix = new Bezoeker();
	static Beheerder johan = new Beheerder();
	static BelastingInspecteur jos = new BelastingInspecteur();
	static Kassa k = new Kassa();
	//switch tussen gebruikers met deze
	static int kapnah = 0;
//======================================== MAIN
	
	public static void main(String[] args) {

		welkom();
	  
		int modus = kiesModus();

		while (true) {
			if ( kapnah == 1 ) {
			  modus = kiesModus();
			  kapnah = 0;
			}
			if ( 0 == modus ) {		//YODACODE!
				mainBezoeker();
			} else if ( 1 == modus ) {
				mainBeheerder();
			}
		}
	}// endofmain
//======================================== METHODEN	
	static int kiesModus() {
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
	
	
	static int mainBezoeker() {
		System.out.print(
<<<<<<< HEAD
				"\n:: \033[4;37mKoop hier uw kaartjes!\033[0;m :: attr #: ");
=======
				"\n:: \033[4;37mKoop hier uw kaartjes!\033[4;37m ::\033[4;37m attr #: ");
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
		int input = Integer.parseInt(sc.nextLine());
		felix.kaartjekopen(input);
		return input;
	}// endofMainBezoeker

	
	static void mainBeheerder() {
<<<<<<< HEAD
		if ( (k.getTotaalKaartjes()) > 15 ){
			jos.inspecteurOpJeDak();
		}else {
		System.out.println(
				"\n::  ------- totaal omzet: ƒ " +
						Attractie.df.format(k.getTotaalOmzet()));
		System.out.println(
				"::  ---- totaal kaartjes: " +
				k.getTotaalKaartjes());
=======
		System.out.println(
				"::  ------- totaal omzet: ƒ " +
						Attractie.df.format(johan.getTotaalOmzet()));
		System.out.println(
				"::  ---- totaal kaartjes: " +
				johan.getTotaalKaartjes());
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
		System.out.print(
				"\n:: Kies attractie voor status -->");

		int input = Integer.parseInt(sc.nextLine());
		johan.statusChecken(input);
		}
	}// endofMainBeheerder
	

	static void welkom() {
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
