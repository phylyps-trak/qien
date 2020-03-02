package Piekenkermis;

import java.util.Scanner;

public class Spin_1 extends RisicoAttractie{
	
	private int draaiLimiet; 
	Scanner spinsc = new Scanner(System.in);
//======================================== CONSTRUCTOR
	Spin_1(String naam, double prijs, int opp) {
		super(naam, prijs, opp);
	}
//======================================== METHODEN	
	void spinDraai() {
		if ( draaiLimiet < 5) {
			this.draaien();
			draaiLimiet += 1;
		} else {
			System.out.print(
					"\033[0;101m Draailimiet bereikt, "
							+ "bel snel de monteur voor controle!\n (type \"ok\")-->: \033[0m");
			if (spinsc.nextLine().equals("ok"));
				onderhoudsbeurt();
				System.out.println("DEBUG draailimiet:" + draaiLimiet);
		}
	}

	@Override
	void opstellingskeuring() {		
	}

	@Override
	void onderhoudsbeurt() {
		System.out.println(
				"De monteur heeft de boel weer doorgesmeerd, "
				+ "gaan met die banaan!");
		setDraaiLimiet(0);
	}

	@Override
	int getDraaiLimiet() {
		return draaiLimiet;
	}
	public void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}

}
