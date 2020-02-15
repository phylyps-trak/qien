/* FINAL: ik ben er klaar mee. 150220
 * 
 * Michiel Janssens
 * 04/02/2020
 * MINI opdracht 1
 * Rock Paper Scissors
 * 
 * om verwarring te voorkomen: throw betekend hier niet "javaklets over if statement op afstand",
 * maar: de shape die de speler "gooit" in het spel. 
 * 
 * VERSIE 2: 15/02: als je allemaal classes maakt werkt het eens stuk beter.
 * VERSIE 3: nu met ROBOT speler
 * 
 */
import java.util.Random;
import java.util.Scanner;  // Import the Scanner class
public class Yankenpon {

	public static void main(String[] args) {
	// de spelers komen binnen gewaggeld
		Speler1 henk = new Speler1();
	//Speler2 jaap = new Speler2(); //Jaap heb geen zin meer
	//maar Robbie de robot wel
		Speler3 robbie = new Speler3();
		
		new Spel().welkom();
		henk.speler1();
		//jaap.speler2();
		robbie.speler3();
		Spel.uitkomst(henk.getter1(), robbie.getter3());  
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
			System.out.println("You win!\n Want "+ kP1 + " beats " +  kP2);
		// X < R
	    } else if ((kP1.contentEquals("x")) && (kP2.contentEquals("r"))) {
			System.out.println("ROBOT wins!\n Because "+ kP2 + " beats " +  kP1);
		// P > R
	    } else if ((kP1.contentEquals("p")) && (kP2.contentEquals("r"))) {
			System.out.println("You win!\n Want "+ kP1 + " beats " +  kP2);
		// P < X
	    } else if ((kP1.contentEquals("p")) && (kP2.contentEquals("x"))) {
			System.out.println("ROBOT wins!\n Because "+ kP2 + " beats " +  kP1);
		// R < P
	    } else if ((kP1.contentEquals("r")) && (kP2.contentEquals("p"))) {
			System.out.println("ROBOT wins!\n Because "+ kP2 + " beats " +  kP1);
		// R > X
	    } else if ((kP1.contentEquals("r")) && (kP2.contentEquals("x"))) {
			System.out.println("You win!\n Want "+ kP1 + " beats " +  kP2);
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

//SPELER2 ----> zit er niet meer in
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

//SPELER3: ROBOT
class Speler3{
	//hier wordt de uitkomst in opgeslagen
	private String p3;
	//maak een array met x p r
	String[] opties = {"x","p","r"};
	//hier wordt het random getal in opgeslagen
	int gekozen = verkrijggetalonder3();
	
	//maakt een random getal van 0, 1 of 2 aan
	int verkrijggetalonder3() {
		Random r = new Random();
		int check = r.nextInt(3);
		//System.out.println(">>"+check);
		return check;
	}

	void speler3() {
		System.out.println("Robbie de Robot maakt een pseudo-random keuze:");
		//DEBUG
		//for (String keuze : opties) {
		//	   System.out.println("Dit zijn de mogelijkheden: " + keuze);}
		
		//trek een random waarde uit "opties" &
		//gooi die waarde als "keuze speler 3" naar de uitkomst methode: robot.getter3 ofzo
		this.p3 = opties[gekozen];
		System.out.println("Hij doet: " + p3 + "\n");
	}//endofspeler3
//getter method
	public String getter3() {
		return p3;
	}//endofgetter
}//endofSpeler3
	

	


