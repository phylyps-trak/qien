/*
 * Michiel Janssens
 * 09/02/2020
 * Ganzenbord - moest eigenlijk voor de masterclass begon
 * beter laat dan nooit, want die blackjack snap ik nog te weinig van.
 * 
 * UPDATE 150220
 * de boel maar eens ge-class-ificeert
 * en uitgebreid
 * 
 */



import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {
//uhm, globale variabelen op class niveau?
static int positie; 
static int worp;
	public static void main(String[] args) {
		//welkom();
		
		}//endofmain
//welkom methode
	void welkom() {
			System.out.println("######################################");
			System.out.println("#  welkom bij een potje ouderwetsch  #");
			System.out.println("#           GANZENBORDEN!            #");
			System.out.println("#                                    #");
			System.out.println("######################################\n\n");
		}//endofwelkom
	
//spel is bezig methode
	void spelen() {
		if(positie < 63) {
			for(int a = 0 ; a < 64 ; a++){
				Ganzenbord.dobbelsteen();
				Ganzenbord.verplaatsen();
				Ganzenbord.ennu(positie, worp);  //  <-- dit is het toppunt van mijn puzzel geweest
				}
			} else {
			System.out.println("Het spel is afgelopen");
			}
		}//endof spel is bezig
	
	//deze methode pakt invoer G en spuugt dan een random getal 0-5 uit...
public static int dobbelsteen() {
	//werp dobbelsteen
		Scanner sc = new Scanner(System.in);
		System.out.print("gooi de dobbelsteen!  [g]\n");
		String gooi = sc.nextLine();
		if (gooi.contentEquals("g")) {
	//dobbelsteen uitkomst
		Random r =  new Random(); 
		worp = r.nextInt(6) +1;
		} System.out.println("je worp is: " + worp);
		return worp;
}//endofdobbelsteen

	//deze methode gebruikt de uitkomst van de worp om de positie te veranderen
public static int verplaatsen() {
	int move = worp;
	positie = (positie + move);
	System.out.println("(Je plaats op het bord is nu " + positie + ".)");
	return positie;
}//endofverplaatsen

	//deze methode bepaald & print wat er gebeurt op speciale posities
public static void ennu(int positie, int worp) {
	//int p = positie;
	//int w = worp;
	System.out.println("---DEBUG");
	System.out.println("---dit is de value van p " + positie );
	System.out.println("---dit is de value van w " + worp );
	
	if(positie == (10 | 20 | 30 | 40 | 50 | 60 )) {
	System.out.println("Je staat op een bonusveld, en gaat extra vooruit");
	positie = (positie + worp);
	}else if(positie == 23) {
		System.out.println("Gevangenis, je bent af!\n");	
	}else if(positie >= 63) {
		System.out.println("Finish, je hebt gewonnen!\n");
	}else if(positie == (25 | 45)) {
		System.out.println("Oeh, balen, ga terug naar start!\n");
	}else {
		System.out.println("Je bent geland op een veilig veld.\n");
	}
	}//endofennu
//methoden voor 
//bonus
//gevangenis
//finish
//terug naar start
}//endofGanzenbord
