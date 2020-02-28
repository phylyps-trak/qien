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
	
	public static void main (   String[] args    ) {
		//alle attracties in een array
		
		
		
		welkom();
		System.out.print("::\033[0m"); String access = sc2.nextLine();
		
		if(access.contentEquals("b")) {
			
			do {
				mainBezoeker();
			}while(true);
		}else if (access.contentEquals("B")){
			do {
				mainBeheerder();
			}while (true);
		}else {
			System.out.println("Jij heb er een teveel op, ga maar naar huis!");
		}

	}//endofmain
	
	static void mainBezoeker() {
		System.out.print("\n  Koop hier uw kaartjes!\n--> ");
		int input = Integer.parseInt(sc.nextLine());
		felix.kaartjekopen(input);
	}//endofMainBezoeker
	
	static void mainBeheerder() {
		System.out.print("\n  Kies attractie voor status:\n--> ");
		int input = Integer.parseInt(sc.nextLine());
		johan.statusChecken(input);
	}//endofMainBeheerder
	static String welkom() {
		System.out.println("\n");
		System.out.println("   ************************");
		System.out.println("   **\033[1m  de PIEKEN KERMIS\033[0m  **");
		System.out.println("   **  ---\033[3;37msinds 1989\033[0m---  **");
		System.out.println("   ************************ \n");
		System.out.println("...\033[1m1\033[0m..botsauto's...\033[1m2\033[0m..spin.....\033[1m3\033[0m..spiegelpaleis...\n"
				+ "...\033[1m4\033[0m..spookhuis....\033[1m5\033[0m..hawaii...\033[1m6\033[0m..ladderklimmen...\n"
				+ "\033[3;90m--------------------------------------------------");
		System.out.println("(bezoekers: type b)\n(beheerders type B)");
		return "S";
	}
}//endofMainPiekenKermis
