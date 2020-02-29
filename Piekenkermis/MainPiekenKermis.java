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
 */
package Piekenkermis;

import java.util.Scanner;

public class MainPiekenKermis {
	
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Bezoeker felix = new Bezoeker();
	static Beheerder johan = new Beheerder();
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
					"\033[3;90m(- bezoekers: type b " +
					"-)\n(- beheerders type B -) -->\033[0m");
			String access = sc2.nextLine();

			if (access.contentEquals("b")) {
				return 0;
			} else if ( access.contentEquals("B")) {
				return 1;
			} else {
				System.out.println(
						"Jij heb er een teveel op, ga maar naar huis!");		
			}
		}
	}//endofkiesmodus
	
	
	static int mainBezoeker() {
		System.out.print(
				"\n:: Koop hier uw kaartjes! :: ");
		int input = Integer.parseInt(sc.nextLine());
		felix.kaartjekopen(input);
		return input;
	}// endofMainBezoeker

	
	static void mainBeheerder() {
//TODO deze dingen op een andere plek, of als USER O & K ingeeft
		System.out.println(
				":: ----- totaal omzet: ƒ " +
						Attractie.df.format(johan.getTotaalOmzet()));
		System.out.println(
				":: ----- totaal kaartjes: " +
				johan.getTotaalKaartjes());
		System.out.print(
				"\n:: Kies attractie voor status -->");

		int input = Integer.parseInt(sc.nextLine());
		johan.statusChecken(input);
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
