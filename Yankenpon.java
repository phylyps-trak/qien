/* 
 * 
 * Michiel Janssens
 * 04/02/2020
 * MINI opdracht 1
 * Rock Paper Scissors
 * 
 * om verwarring te voorkomen: throw betekend hier niet "javaklets over if statement op afstand",
 * maar: de shape die de speler "gooit" in het spel. 
 * 
 * VERSIE 2: 15/02 als je allemaal classes maakt werkt het eens stuk beter.
 * VERSIE 3: 15/02 nu met random ROBOT speler
 * VERSIE 4: 15/02 nu met repeat ja/nee
 * VERSIE 4.2: 16/02 als je bij repeat n, of iets raars intiept kan je het nogmaals doen
 * VERSIE 5: 16/02 als je iets anders dan x p r intiept zegt i: doe ff normaal joh
 * TODO -->> VERSIE 6: met moeilijke ASCII
 * TODO -->> VERSIE 7: rock paper scissors lizard spock?
 * TODO -->> speler naam dynamisch opbouwen. 
 * Dus overal waar je nu "Dawa" of "Robbie" print, wil je iets van speler.naam. 
 * En dan bouw je een speler op met Speler speler1 = new Speler('dawa')
 * en dan als je 't helemaal fancy wil maken: RobotSpeler als subclass van Speler, 
 * met z'n eigen methode om een gooi te maken (want random, en niet met input), 
 * maar dezelfde code voor z'n naam!
 * Je Class-structure is dan dus misschien: Speler, met twee subclasses: MensSpeler en RobotSpeler

	Speler speler1 = new Speler('dawa'); // Of nog cooler, de user zelf zn naam laten invullen
	Speler speler2 = new RobotSpeler('robbie');
 */
//import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

public class Yankenpon {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//new Spel().relaties();

		//do-while loop ding zodat je vaker dan 1 keer kan spelen
		do {
			// de spelers komen binnen gewaggeld
			Speler1 dawa = new Speler1();
			//Speler2 jaap = new Speler2(); //Jaap heb geen zin meer
			//maar Robbie de robot wel
			Speler3 robbie = new Speler3();
			new Spel().welkom();

			dawa.speler1();
			//jaap.speler2();
			robbie.speler3();
			Spel.uitkomst(dawa.getter1(), robbie.getter3());
		} while (new Spel().stopDoor().equals("j"));


		sc.close();

	}//endofmain
}//endofyankenpon

class Spel{
	/*
	//HASH MAP met relationele dingen
	void relaties(){
		{
			System.out.println("DEBUG");
		}
	// Create a HashMap object
    HashMap<String, String> moves = new HashMap<String, String>();
    // Add keys and values
    moves.put("r", "x");
    moves.put("p", "r");
    moves.put("x", "p");
    //DEBUG
    for (String i : moves.keySet()) {
      System.out.println("key: " + i + " value: " + moves.get(i));
    // TODO 
      mijnThrow = 'x'
    		  jouwThrow = 'p'
    		  moves.get(mijnThrow) == jouwThrow
    }
	}
	 */
	// introductie & uitleg
	//char x = '¥';
	//char p = '▒';
	//char r = 'Θ';
	void welkom() {
		System.out.println("Welkom bij SCHAAR, PAPIER, STEEN");
		System.out.println(" ------------------------------- ");
		System.out.println("|  input: x = scissors  ¥       |");
		System.out.println("|  input: p = paper     ▒       |");
		System.out.println("|  input: r = rock      Θ       |");
		System.out.println(" ------------------------------- ");
		System.out.println("| Jouw naam is Dawa,            |");
		System.out.println("| en je speelt een spel!        |");
		System.out.println(" ------------------------------- \n\n");
	}//endofwelkom
	//UITKOMST
	static void uitkomst(String a, String b) {
		String kP1 = a;
		String kP2 = b;
		// GELIJKSPEL
		if(kP1.contentEquals(kP2)) {
			System.out.println("** Gelijkspel, vet saai! **");

			// ALLE ANDERE MOGELIJKHEDEN	
			// X > P
		} else if ((kP1.contentEquals("x")) && (kP2.contentEquals("p"))) {
			System.out.println("** You win! **\n  (want "+ kP1 + " beats " +  kP2 + ")");
			// X < R
		} else if ((kP1.contentEquals("x")) && (kP2.contentEquals("r"))) {
			System.out.println("** ROBOT wins!\n  (want "+ kP2 + " beats " +  kP1 + ")");
			// P > R
		} else if ((kP1.contentEquals("p")) && (kP2.contentEquals("r"))) {
			System.out.println("** You win! **\n  (want "+ kP1 + " beats " +  kP2 + ")");
			// P < X
		} else if ((kP1.contentEquals("p")) && (kP2.contentEquals("x"))) {
			System.out.println("** ROBOT wins!\n  (want "+ kP2 + " beats " +  kP1 + ")");
			// R < P
		} else if ((kP1.contentEquals("r")) && (kP2.contentEquals("p"))) {
			System.out.println("** ROBOT wins!\n  (want "+ kP2 + " beats " +  kP1 + ")");
			// R > X
		} else if ((kP1.contentEquals("r")) && (kP2.contentEquals("x"))) {
			System.out.println("** You win! **\n  (want "+ kP1 + " beats " +  kP2 + ")");
		}
	}
	String con;

	//DOORGAAN OF STOPPEN
	String stopDoor() {
		{
		System.out.println("\n================");
		System.out.println("Ben je in voor een revanche?\n  (type j / n)");
		}
		do {
		this.con = Yankenpon.sc.nextLine(); 
		if (con.contentEquals("n")) {
			System.out.println("Nou, ga maar lekker iets anders doen dan...");
		} else if (con.contentEquals("j")) {
		      System.out.println("\n...here we go again!\n");
	    } else {
	    	System.out.println("Je invoer slaat nergens op, gek!");
	    }
		} while (!con.contentEquals("j"));
		return con;
	}	
}//endofspel

//SPELER 1
class Speler1{
	private String p1;

	void speler1() {
		System.out.println("Dawa, voer hier je keuze in:");
		this.p1 = Yankenpon.sc.nextLine();  // Read user input
		System.out.println("Jouw throw is: " + p1);  // Output user input
		System.out.println("================\n");
	}//endofspeler1

	public String getter1() {
		return p1;
	}//endofgetter
}//endofSpeler1

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

		//trek een random waarde uit "opties" &
		//gooi die waarde als "keuze speler 3" naar de uitkomst methode: robot.getter3 ofzo
		this.p3 = opties[gekozen];

		System.out.println("Hij doet --> " + p3 + "\n");
	}//endofspeler3

	//getter method
	public String getter3() {
		return p3;
	}//endofgetter

}//endofSpeler3





