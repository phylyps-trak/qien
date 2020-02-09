/*
 * Michiel Janssens
 * 04/02/2020
 * MINI opdracht 1
 * Rock Paper Scissors
 * 
 * 
 * 
 * O, en natuurlijk een computer speler die een random keuze maakt.
 * 
 * 
 */
import java.util.Scanner;  // Import the Scanner class
public class Yankenpon {

	public static void main(String[] args) {
		
		// introductie & uitleg
		System.out.println("Welkom bij SCHAAR, PAPIER, STEEN");
		System.out.println(" ------------------------------- ");
		System.out.println("|  input: x = scissors          |");
		System.out.println("|  input: p = paper             |");
		System.out.println("|  input: r = rock              |");
		System.out.println(" ------------------------------- \n\n");
		
		// INPUT
		// dingen voor speler 1
		System.out.println("Player One, voer hier je keuze in:");
		
		Scanner scannerPlayerOne = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("-> Throw! ->");

	    String keuzeP1 = scannerPlayerOne.nextLine();  // Read user input
	    System.out.println("Je throw is: " + keuzeP1);  // Output user input
	    System.out.println(" ------------------------------- ");
		
		// dingen voor speler 2
		System.out.println("Player Two, voer hier je keuze in:");

		Scanner scannerPlayerTwo = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("-> Throw! ->");

	    String keuzeP2 = scannerPlayerTwo.nextLine();  // Read user input
	    System.out.println("Je throw is: " + keuzeP2);  // Output user input
	    scannerPlayerOne.close();
	    scannerPlayerTwo.close();
	    
	    
		//UITKOMST
		// GELIJKSPEL
	    if(keuzeP1.contentEquals(keuzeP2)) {
	    	System.out.println("\n Gelijkspel, vet saai!");
	    	
	    // ALLE ANDERE MOGELIJKHEDEN	
	    // X > P
	    } else if ((keuzeP1.contentEquals("x")) && (keuzeP2.contentEquals("p"))) {
			System.out.println("Player One wins! Because "+ keuzeP1 + " beats " +  keuzeP2);
		// X < R
	    } else if ((keuzeP1.contentEquals("x")) && (keuzeP2.contentEquals("r"))) {
			System.out.println("Player Two wins! Because "+ keuzeP2 + " beats " +  keuzeP1);
		// P > R
	    } else if ((keuzeP1.contentEquals("p")) && (keuzeP2.contentEquals("r"))) {
			System.out.println("Player One wins! Because "+ keuzeP1 + " beats " +  keuzeP2);
		// P < X
	    } else if ((keuzeP1.contentEquals("p")) && (keuzeP2.contentEquals("x"))) {
			System.out.println("Player Two wins! Because "+ keuzeP2 + " beats " +  keuzeP1);
		// R < P
	    } else if ((keuzeP1.contentEquals("r")) && (keuzeP2.contentEquals("p"))) {
			System.out.println("Player Two wins! Because "+ keuzeP2 + " beats " +  keuzeP1);
		// R > X
	    } else if ((keuzeP1.contentEquals("r")) && (keuzeP2.contentEquals("x"))) {
			System.out.println("Player One wins! Because "+ keuzeP1 + " beats " +  keuzeP2);
	    }
	    
	}

}

