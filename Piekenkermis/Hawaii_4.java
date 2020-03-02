package Piekenkermis;

import java.util.Scanner;

public class Hawaii_4 extends RisicoAttractie{
	
	private int draaiLimiet; 
	Scanner hawsc = new Scanner(System.in);
//======================================== CONSTRUCTOR
	Hawaii_4(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
	}
//======================================== METHODEN	
	void hawaiiDraai() throws RisicoException{  
			this.draaien();
			draaiLimiet += 1;
			if (draaiLimiet > 10 ) 
				throw new RisicoException();
	}

	@Override
	void onderhoudsbeurt() {
		System.out.println(
				"De monteur heeft de boel weer doorgesmeerd, "
				+ "gaan met die banaan!");
		setDraaiLimiet(0);
	}
	
	@Override
	public void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}
	@Override
	int getDraaiLimiet() {
		return draaiLimiet;
	}
	@Override
	void opstellingskeuring() throws Exception {
		if ( draaiLimiet < 10) {
			this.draaien();
			draaiLimiet += 1;
		}
	}
	class RisicoException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		
	}
	void opstellingskeuring(Attractie a) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
