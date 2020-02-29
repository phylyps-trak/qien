/*	26/02/2020
 * 	Michiel Janssens
 * 	De Pieken Kermis
 *  ----------------
 *  volgens weekopdracht 2
 * 
 * 	dingen die geleerd zijn:
 * 	- overerfde methode netjes doen
 * 	- DecimalFormat voor weergave prijzen
 * 
 * 
 * 
 */
package Piekenkermis;

import java.util.Scanner;

public class MainPiekenKermis {
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Techniek t = new Techniek();
	static Bezoeker felix = new Bezoeker();
	static Beheerder johan = new Beheerder();
	static int go = 0;


	public static void main(String[] args) {

		welkom();
	
		
		allesDraait();
	
	}// endofmain
	
	static void allesDraait() {
		do {
			go = 0;
			System.out.print("\033[3;90m(- bezoekers: type b -)\n(- beheerders type B -) -->\033[0m");
			String access = sc2.nextLine();

			if (access.contentEquals("b")) {
				do {
					mainBezoeker();
				} while (go == 0);
				
			} else if (go == 1) {
				break;
				
			} else if (access.contentEquals("B")) {
				do {
					mainBeheerder();
				} while (go == 0);
				
			} else if (go == 1) {
				break;
			} else {
				System.out.println("Jij heb er een teveel op, ga maar naar huis!");
			}
		} while (true);
		}//endofallesDraait
	
	
	static int mainBezoeker() {
		System.out.print("\n:: Koop hier uw kaartjes! :: ");
		int input = Integer.parseInt(sc.nextLine());
		felix.kaartjekopen(input);
		return input;
	}// endofMainBezoeker

	
	static void mainBeheerder() {
		double totaalOmzet = (
				Kermis.rides[0].berekenOmzet() +
				Kermis.rides[1].berekenOmzet() +
				Kermis.rides[2].berekenOmzet() +
				Kermis.rides[3].berekenOmzet() +
				Kermis.rides[4].berekenOmzet() +
				Kermis.rides[5].berekenOmzet() );
		int totaalKaartjes = (
				Kermis.rides[0].getKaartjes() +
				Kermis.rides[1].getKaartjes() +
				Kermis.rides[2].getKaartjes() +
				Kermis.rides[3].getKaartjes() +
				Kermis.rides[4].getKaartjes() +
				Kermis.rides[5].getKaartjes() 
				);
		System.out.println(":: ----- totaal omzet: ƒ " + Attractie.df.format(totaalOmzet));
		System.out.println(":: ----- totaal kaartjes: " + totaalKaartjes);
		System.out.print("\n:: Kies attractie voor status -->");

		int input = Integer.parseInt(sc.nextLine());
		johan.statusChecken(input);
	}// endofMainBeheerder

	static String welkom() {
		System.out.println("\n");
		System.out.println("   ************************");
		System.out.println("   **\033[1m  de PIEKEN KERMIS\033[0m  **");
		System.out.println("   **  ---\033[3;37msinds 1989\033[0m---  **");
		System.out.println("   ************************ \n");
		System.out.println(
				"...\033[1m1\033[0m..botsauto's...\033[1m2\033[0m..spin.....\033[1m3\033[0m..spiegelpaleis...\n"
						+ "...\033[1m4\033[0m..spookhuis....\033[1m5\033[0m..hawaii...\033[1m6\033[0m..ladderklimmen...\n"
						+ "\033[3;90m--------------------------------------------------");
		return "S";
	}
}// endofMainPiekenKermis
