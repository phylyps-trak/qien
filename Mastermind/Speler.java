package Mastermind;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Speler{



// tellertjes
	protected int goedCounter = 0;
	protected int bijnaCounter = 0;
	protected int turnCounter = 10;
	protected int foutCounter = 0;
	protected String naam;

// dit is de array waar de input in moet
	protected String[] gokje;

//========				//CONSTRRRRRUCTORRRRR --> nog dingen mee doen
	Speler(String naam, int a, int b, int c, int e) {
		this.goedCounter = a;
		this.bijnaCounter = b;
		this.foutCounter = e;
		this.turnCounter = c;
		this.naam = naam;
	}

//======			// de speler doet een poging		
	void doeEenGooi() {
	//zet wat dingen klaar
		Scanner sc = new Scanner(System.in);
		int inputTest = 0;
	//hieraan moet de input straks voldoen
		String pattern = "^([a-h]{1},?[a-h]{1},?[a-h]{1},?[a-h]{1},?[a-h]{1}$)";
		Pattern r = Pattern.compile(pattern);
		
		do {
	//get user input
		System.out.print("-> ");	
		String line = sc.nextLine();
	//check de input
		Matcher m = r.matcher(line);
		
		if (m.matches()) {
	//hak de input in stukjes bij de komma, maak hoofdletters van, stop in array gokje
			this.gokje = line.toUpperCase().split(",");
	//netjes weergeven		
			System.out.print("\n |");
			for(String s: gokje)
				System.out.print(" " + s +" |");
			System.out.println(" ");
	//teller zodat je opnieuw kan als de input niet correct was		
			inputTest ++;
		}else {                 
			System.out.println("\033[3;90m\n--- Zoiets typen werkt helaas niet...");
			System.out.println("--- Probeer het nog eens?------------\n\033[0m");
		}
		
		}while(inputTest == 0);
		
	}//endof doeEenGooi
	
//=============			//GETTERs & SETTERs & REsetters
	public void reset () {
		goedCounter = 0;
		bijnaCounter = 0;
		foutCounter = 0;
	}
	public String[] getGokje() {
		return gokje;
	}
	public int getGoedCounter() {
		return goedCounter;
	}
	public int getFoutCounter() {
		return foutCounter;
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
	public void setFoutCounter(int foutCounter) {
		this.foutCounter += foutCounter;
	}

}//endof Speler


