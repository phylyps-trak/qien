package Piekenkermis;

public class Monteur {
	
		void onderhoudsbeurt(RisicoAttractie r){	
				r.setDraaiLimiet(0);
				System.out.println(
						"De monteur heeft de boel weer doorgesmeerd, "
						+ "gaan met die banaan!");
				System.out.println("DEBUG: nieuwe draailimiet:" + r.getDraaiLimiet() );
			}
	}
