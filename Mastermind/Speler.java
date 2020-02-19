package Mastermind;

import java.util.Scanner;

public class Speler{
	// TODO dynamische naamgeving
	String naam;
	
	// tellertjes
	int goedCounter;
	int bijnaCounter;
	int turnCounter = 10;
	
	// dit is de array waar de input in moet
	private String[] gokje = new String[5];
	
//==========			// speler doet een poging		
	void doeEenGooi() {
		Scanner in = new Scanner(System.in);
		System.out.println("   _________");
		System.out.print("-> ");	String line = in.nextLine(); 
		System.out.println("   _________");
		//hak de input in stukjes bij de komma, maak hoofdletters van, stop in arra
		gokje = line.toUpperCase().split(",");
		System.out.print("\n |");
		for(String s: gokje)
			System.out.print(" " + s +" |");
		System.out.println(" ");
		//DEBUG
		//System.out.println("DEBUG gokje: " + (Arrays.toString(gokje)));

	}//endof doeEenGooi

//==============		//GETTER method
	String[] geefGokDoor() {
		String [] poging = new String[5];
		poging = gokje;
		return poging;
	}


}//endof Speler