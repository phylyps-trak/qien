package Piekenkermis;

import java.util.Scanner;

public abstract class RisicoAttractie extends Attractie{
	

	private int draaiLimiet = super.getKaartjes();
	
	
	RisicoAttractie(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
	}

	abstract void opstellingskeuring() throws Exception;

	
	abstract void onderhoudsbeurt();

	abstract int getDraaiLimiet();

	public void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}
	
	
}
