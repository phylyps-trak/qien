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
	void hawaiiDraai() {
<<<<<<< HEAD
		try {   
			this.draaien();
			draaiLimiet += 1;
			if (draaiLimiet > 10 ) {
				throw new risicoException();
			}
		}catch (Exception e) {
			System.out.print(
					"\033[0;101m Draailimiet bereikt, "
							+ "bel snel de monteur voor controle!\n (type \"ok\")-->: \033[0m");
			if (hawsc.nextLine().equals("ok")){
				onderhoudsbeurt();
				System.out.println("DEBUG draailimiet:" + draaiLimiet);
			}
		}
	}

=======
		if ( draaiLimiet < 10) {
			this.draaien();
			draaiLimiet += 1;
		} else {
			System.out.print(
					"\033[0;101m Draailimiet bereikt, "
							+ "bel snel de monteur voor controle!\n (type \"ok\")-->: \033[0m");
			if (hawsc.nextLine().equals("ok"));
				onderhoudsbeurt();
				System.out.println("DEBUG draailimiet:" + draaiLimiet);
		}
	}
	
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
	@Override
	void onderhoudsbeurt() {
		System.out.println(
				"De monteur heeft de boel weer doorgesmeerd, "
				+ "gaan met die banaan!");
		setDraaiLimiet(0);
	}
<<<<<<< HEAD
	
=======
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
	@Override
	public void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}
	@Override
<<<<<<< HEAD
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
	class risicoException extends Exception {
		
		
=======
	void opstellingskeuring(Attractie a) {
		
	}
	@Override
	int getDraaiLimiet() {
		return draaiLimiet;
>>>>>>> e989653887baf4ccc93cccd5ca92de8973e72782
	}
}
