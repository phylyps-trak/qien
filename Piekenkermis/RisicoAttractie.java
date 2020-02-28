package Piekenkermis;

public abstract class RisicoAttractie extends Attractie{
	
	RisicoAttractie(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
		// TODO Auto-generated constructor stub
	}

	abstract void opstellingskeuring(Attractie a);

	abstract void draailimiet(int r);
	// r voor: rondjes
	
	abstract void onderhoudsbeurt();
	
	
}
