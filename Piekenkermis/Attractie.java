package Piekenkermis;

import java.text.DecimalFormat;

public class Attractie {
	
//om de prijs netjes te printen
	static	final DecimalFormat df = new DecimalFormat("0.00");

	private String naam;
	private double prijs;
	private final int opp;
	private int kaartjes;
	protected double omzet;

	public boolean gokken = false;
	
//======================================== CONSTRUCTOR
	Attractie(String naam, double prijs, int opp){
		this.naam = naam;
		this.prijs = prijs;
		this.opp = opp;
		}//endof constructor

//======================================== METHODEN
	public void draaien() {
		kaartjes += 1;
		System.out.println(
				this.toString());
		System.out.println(
				"      \033[4;36mVeel plezier!\033[0m");
		System.out.println("DEBUG-tickets: " + kaartjes);

	}//endofdraaien
	
	@Override
	public String toString() {
		return " ***  Welkom bij \033[0;32m" +
				naam +
				"\033[0m\n" +
				"\033[3;90m      toegang: ƒ " +
				df.format(prijs) +
				", [" +
				opp +
				"m²]\033[0m";
		}//endoftoString
	
//======================================== GETTERS & SETTERS
	public String getNaam() {
		return naam;
	}
	public int getKaartjes() {
		return kaartjes;
	}
	public void setKaartjes(int kaartjes) {
		this.kaartjes = kaartjes;
	}
	double berekenOmzet() {
		omzet = kaartjes * prijs;
		return omzet;
	}//endofberekenOmzet
	
	double getOmzet(){
		return omzet;
	}
	
	void setOmzet(double o) {
		this.omzet = o;
	}

}//endofattractie
