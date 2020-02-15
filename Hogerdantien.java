/*
 * FINAL: ik ben er klaar mee. 080220
 * 
 * Michiel Janssens
 * 06/02/2020
 * MINI opdracht 3
 * Array Lists
 * 
 * 0702 HARD GEFAALD!
 * UPDATE 0802: gelukt! nieuwe begrip!
 * 
 * BUG moet eruit: waarom die pointercode?
 * - oh kijk, dat was een check syso
 * 
 */
public class Hogerdantien {
	public static void main(String[] args) {
		//	1.maak de field aan
		int[] mijnArray = {0,2,5,7,12,27,34,36,54,98}; // array init & decl		
		//WAAROM IS DIT??	//stop de juiste array in je method	
		//--> omdat mijnArrayMethod niet static is...
		new  Hogerdantien().mijnArrayMethod(mijnArray);
	}//endofmain	
			
	//	2. zorg dat de method iets kan doen met EEN array, die een identifier heeft
	void mijnArrayMethod( int[] ditIsEm ) {	
		//System.out.println(ditIsEm); 	
		// debugcheck: print het argument, geeft pointercode: iser wel, zit niks in.
			  
				// initializer 		//evaluator 					//incrementor   (forloopuitleg)
			for( int x = 0    ;    x < ditIsEm.length  		; x++  ) {
              //vanaf index 0		// zo veel als er laatjes zijn 	//1 index verder
				
				if ( ditIsEm[x] > 10) {System.out.println( ditIsEm[x] +" dit getal is hoger dan tien"); 
				}else {
				System.out.println(		ditIsEm[x]		);
									//print de index (dus elke keer dat i langs loopt
				}//endofif
				}//endofforloop	
	}//endofmijnArrayMethod
} //endofclass
	

