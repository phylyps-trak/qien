package Mastermind;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Speler{
// TODO dynamische naamgeving


// tellertjes
	protected int goedCounter = 0;
	protected int bijnaCounter = 0;
	protected int turnCounter = 10;
	protected String naam;

// dit is de array waar de input in moet
	protected String[] gokje;

//========				//CONSTRRRRRUCTORRRRR --> nog dingen mee doen
	Speler(String naam, int a, int b, int c) {
		this.goedCounter = a;
		this.bijnaCounter = b;
		this.turnCounter = c;
		this.naam = naam;
	}

	//==========			// de speler doet een poging		
	void doeEenGooi() {
		Scanner sc = new Scanner(System.in);
		int inputTest = 0;
		String pattern = "^([a-h]{1},?[a-h]{1},?[a-h]{1},?[a-h]{1},?[a-h]{1}$)";

		do {
		Pattern r = Pattern.compile(pattern);
		System.out.print("-> ");	
		String line = sc.nextLine();
//pattern checker

		Matcher m = r.matcher(line);
		
		if (m.matches()) {
//hak de input in stukjes bij de komma, maak hoofdletters van, stop in array gokje
			this.gokje = line.toUpperCase().split(",");
			System.out.print("\n |");
			for(String s: gokje)
				System.out.print(" " + s +" |");
			System.out.println(" ");
			inputTest ++;
		}else {
			System.out.println("\033[0;90m\n--- Als je zoiets tiept, werkt het niet...");
			System.out.println("--- Probeer het nog eens?-----------------\n\033[0m");
		}
		
		}while(inputTest == 0);
		
	}//endof doeEenGooi
	
//=============			//GETTERs & SETTERs & REsetters
	public void reset () {
		goedCounter = 0;
		bijnaCounter = 0;
	}
	public String[] getGokje() {
		return gokje;
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
		this.bijnaCounter += bijnaCounter;
	}

	void patterntest() {
	}
}//endof Speler


