/*
 * Michiel Janssens
 * 04/02/2020
 * MINI opdracht 1
 * Rock Paper Scissors
 * 
 * om verwarring te voorkomen: throw betekend hier niet "javaklets over if statement op afstand",
 * maar: de shape die de speler "gooit" in het spel. 
 * 
 * VERSIE 2: 15/02: als je allemaal classes maakt werkt het eens stuk beter.
 * 
 */
import java.util.Scanner;  // Import the Scanner class
public class Yankenpon {

	public static void main(String[] args) {
		Speler1 henk = new Speler1();
		Speler2 jaap = new Speler2();
		new Spel().welkom();
		henk.speler1();
		jaap.speler2();
		Spel.uitkomst(henk.getter1(), jaap.getter2());

		
		
	
	    

	    
	}//endofmain
}//endofyankenpon
class Spel{
// introductie & uitleg
	void welkom() {
		System.out.println("Welkom bij SCHAAR, PAPIER, STEEN");
		System.out.println(" ------------------------------- ");
		System.out.println("|  input: x = scissors          |");
		System.out.println("|  input: p = paper             |");
		System.out.println("|  input: r = rock              |");
		System.out.println(" ------------------------------- \n\n");
	}//endofwelkom
//UITKOMST
		static void uitkomst(String a, String b) {
			String kP1 = a;
			String kP2 = b;
		// GELIJKSPEL
	    if(kP1.contentEquals(kP2)) {
	    	System.out.println("\n Gelijkspel, vet saai!");
	    	
	    // ALLE ANDERE MOGELIJKHEDEN	
	    // X > P
	    } else if ((kP1.contentEquals("x")) && (kP2.contentEquals("p"))) {
			System.out.println("Player One wins! Because "+ kP1 + " beats " +  kP2);
		// X < R
	    } else if ((kP1.contentEquals("x")) && (kP2.contentEquals("r"))) {
			System.out.println("Player Two wins! Because "+ kP2 + " beats " +  kP1);
		// P > R
	    } else if ((kP1.contentEquals("p")) && (kP2.contentEquals("r"))) {
			System.out.println("Player One wins! Because "+ kP1 + " beats " +  kP2);
		// P < X
	    } else if ((kP1.contentEquals("p")) && (kP2.contentEquals("x"))) {
			System.out.println("Player Two wins! Because "+ kP2 + " beats " +  kP1);
		// R < P
	    } else if ((kP1.contentEquals("r")) && (kP2.contentEquals("p"))) {
			System.out.println("Player Two wins! Because "+ kP2 + " beats " +  kP1);
		// R > X
	    } else if ((kP1.contentEquals("r")) && (kP2.contentEquals("x"))) {
			System.out.println("Player One wins! Want "+ kP1 + " beats " +  kP2);
	    }
		}

}//endofspel

//SPELER 1
class Speler1{
	private String p1;
	
	void speler1() {
		System.out.println("Player One, voer hier je keuze in:");
		
		Scanner scannerPlayerOne = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("-> Throw! ->");

	    this.p1 = scannerPlayerOne.nextLine();  // Read user input
	    System.out.println("Je throw is: " + p1);  // Output user input
	    System.out.println(" ------------------------------- ");
	}//endofspeler1
	
	public String getter1() {
		return p1;
	}//endofgetter
}//endofSpeler1

//SPELER2
class Speler2{
	private String p2;
	
	void speler2() {
		System.out.println("Player Two, voer hier je keuze in:");

		Scanner scannerPlayerTwo = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("-> Throw! ->");

	    this.p2 = scannerPlayerTwo.nextLine();  // Read user input
	    System.out.println("Je throw is: " + p2);  // Output user input
	}//endofspeler2
	
	public String getter2() {
		return p2;
	}//endofgetter
}//endofSpeler2
	

	


