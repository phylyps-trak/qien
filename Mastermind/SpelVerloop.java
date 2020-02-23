package Mastermind;

import java.util.Scanner;

public class SpelVerloop{
	String con;
	static Scanner sc = new Scanner(System.in);

//======					//extra methodetje om de gevulde codearray netjes te laten zien
	void laatCodeZien( String[] codeArray){
		System.out.println("\033[0;90m   [de geheime code]\033[0m");
		System.out.println("  -------------------");
		for(int a = 0 ; a < codeArray.length ; a++ ){
			System.out.print(" | " + codeArray[a] );
		}
		System.out.print(" |");
		System.out.println(" ");			
		System.out.println("  -------------------");

	}//endof laatCodeZien
//======
	void eersteBeurt() {
		//eerste beurt

		System.out.println("\n...en nu jij, raden maar!  (format: x,x,x,x,x)");
		System.out.println("=======================");
	}
//======					//INTRO hahah lekker ascii klooien, heerlijk
	void welkom() {
		System.out.println("\033[0;90m######################################\033[0m");
		System.out.println("\033[1;33m    Welkom bij \033[1;31mMASTERMIND\033[0m \033[1;33msuperieur\033[0m");
		System.out.println("\033[0;33m  ----------------------------------- ");
		System.out.println(" |   Het bekroonde spel voor de      |");
		System.out.println(" |   professionele codebrekers       |");
		System.out.println(" |     Le jeu champion pour les      |");
		System.out.println(" |     professionels du decodage     |");
		System.out.println("    -------------------------------   ");
		System.out.println(" |   met 5 gaten en 8 kleuren        |");
		System.out.println(" |     avec 5 cases et 8 couleurs    |");
		System.out.println("  ----------------------------------- ");
		System.out.println("                                      ");
		System.out.println(" ------ Spel van het jaar 1975! ------\033[0m");
		System.out.println("\033[0;90m######################################\033[0m");
		System.out.println("\n");
	}//endofwelkom
	
//========					//DOORGAAN OF STOPPEN
	protected String stopDoor() {
		{
			System.out.println("\033[0;90m\n================");
			System.out.println("Wil je nog eens spelen?\n  (type j / n)");
		}
		do {
			this.con = sc.nextLine(); 
			if (con.contentEquals("n")) {
				System.out.println("Nou, ga maar lekker iets anders doen dan...");
			} else if (con.contentEquals("j")) {
				System.out.println("\n...here we go again!\n");
			} else {
				System.out.println("Je invoer slaat nergens op, gek!");
			}
		} while (!con.contentEquals("j\033[0m"));
		return con;
	}	

}//endofSpelVerloop
