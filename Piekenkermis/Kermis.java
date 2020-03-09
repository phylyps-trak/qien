package Piekenkermis;

import java.util.Scanner;

public class Kermis {
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Bezoeker felix = new Bezoeker();
	Beheerder johan = new Beheerder();
	BelastingInspecteur inspecteur;
	Monteur michiel = new Monteur();
	Kassa k; //de kassa mag stiticx zijn, omdat i voor iedereen bereikbaar niet zijn
	//switch tussen gebruikers met deze
	int kapnah = 0;
	
	Kermis(){
		this.inspecteur = new BelastingInspecteur(this);
		this.k = new Kassa(this);
	}
	
	void starten() {
		System.out.println("jojo");
	}
	
	 Attractie[] rides = new Attractie[] {
			new Botsautos_0(		"Crash Cars", 2.50, 500 ),					//0
			new Spin_1(				"Barf Arachnid", 2.25, 300 ),				//1
			new Spiegelpaleis_2(	"Through the Looking Glass", 2.75, 250 ),	//2	
			new Spookhuis_3(		"Lovecraft Madness", 3.20, 350),			//3
			new Hawaii_4(			"Wobbly Beach", 2.90, 200 ),				//4
			new Ladderklimmen_5(	"Trappetje op...", 5.00, 150 )				//5
	};
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
			int input=-1;
			try {
			input = Integer.parseInt(sc.nextLine());
			felix.kaartjekopen(input);
			}catch (Exception e) {
				System.out.print(
						"\033[0;101m Draailimiet bereikt, "
								+ "bel snel de monteur voor controle!\n (type \"ok\")-->: \033[0m");
				if (sc.nextLine().equals("ok")){
					
					RisicoAttractie r = (RisicoAttractie) rides[input];

					michiel.onderhoudsbeurt(r);  

				}
			}
		}// endofMainBezoeker
		
		
		void mainBeheerder() {
			if ( (k.getTotaalKaartjes()) > 15 ){
				inspecteur.inspecteurOpJeDak();
			}else {
			k.berekenTotaalOmzet();
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
}
