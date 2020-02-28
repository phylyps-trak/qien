package Piekenkermis;

import java.text.DecimalFormat;

public class Attractie {
	
	//om de prijs netjes te printen
	static	final DecimalFormat df = new DecimalFormat("0.00");
	//gewone fields
	private String naam;
	private double prijs;
	private double omzet;
	private final int opp;
	
	//constructor
	Attractie(String naam, double prijs, int opp){
		this.naam = naam;
		this.prijs = prijs;
		this.opp = opp;
		}
	//maak kassa per attractie
	Kassa k = new Kassa();
	
	double berekenOmzet() {
		this.omzet = k.getKaartjes() * this.prijs;
		return omzet;
	}//endofberekenOmzet

	public void draaien() {
		System.out.println(this.toString());
	}//endofdraaien
	
	@Override
	public String toString() {
		return " ***  Welkom bij \033[0;32m" + naam + "\033[0m\n" +
				"\033[3;90m      toegang: ƒ " + df.format(prijs) +", [" + opp + "m²]\033[0m";
		}//endoftoString
}//endofattractie
