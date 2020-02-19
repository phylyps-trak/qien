package Mastermind;

import java.util.Scanner;

public class Speler{
	// TODO dynamische naamgeving

	
	// tellertjes
	protected int goedCounter = 0;
	protected int bijnaCounter = 0;
	protected int turnCounter = 10;
	protected String naam;
	
	// dit is de array waar de input in moet
	String[] gokje = new String[5];
//==========
	Speler(String naam, int a, int b, int c) {
		this.goedCounter = a;
		this.bijnaCounter = b;
		this.turnCounter = c;
		this.naam = naam;
		
	}
	
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

//==============		//GETTERs & SETTERs
	String[] geefGokDoor() {
		String [] poging = new String[5];
		poging = gokje;
		return poging;
	}

	public int getGoedCounter() {
		return goedCounter;
	}

	public void setGoedCounter(int goedCounter) {
		this.goedCounter += goedCounter;
	}

	public int getBijnaCounter() {
		return bijnaCounter;
	}

	public void setBijnaCounter(int bijnaCounter) {
		this.bijnaCounter = bijnaCounter;
	}


}//endof Speler