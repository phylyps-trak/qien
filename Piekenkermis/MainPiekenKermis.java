/*	26/02/2020
 * 	Michiel Janssens
 * 	De Pieken Kermis
 *  ----------------
 *  volgens weekopdracht 2
 * 
 * 	dingen die geleerd zijn:
 * 	- overerfde methode netjes doen
 * 	- DecimalFormat voor weergave prijzen
 * 	- for en while loopjes zo economisch mogelijk maken
 *  - lekker door de objectarrays heenlopen & methoden roepen 
 *  - switchen tussen ene en andere modus van user invoer met KAPNAH
 *  - uitgevonden dat je TEGELIJK de returnwaarde van een methode 
 *  in een var kan opslaan, EN de methode kan uitvoeren... (39)
 * 
 * VRAAG: hoe kan ik de Belastinginspecteur de juiste attracties eruit laten pikken? (methode heffen)
 * VRAAG: hoe moet ik de abstracte class juist gebruiken? Ze zijn nu eigenlijk individueel
 * VRAAG: ik weet niet hoe je op een handige manier die exceptions in je structuur bouwt.
 * 
 * VRAAG ik wil al die functionalisteit UIT de static context slopen, en in objecten stoppen.
 * Hoe pak je dat aan? Hoe kan ik dat hier achteraf inregelen?
 * 
 * VRAAG: regel 107 +/-
 * 
 * TODO abstracte clss risicoattr netjes implementeren: de attr zelf werken wel, 
 * maar had net zo goed zonder die abstracte gekund...
 * 
 * TODO enkele dingen uit de mainbeheerder methode op een andere plek, of als USER O & K ingeeft
 * 
 * TODO kassa object toch maar maken, misschien met kopieen van alle nu rondzwervende waarden?
 * 
 * TODO zorgen dat foutieve input in keuzemenu beter wordt opgevangen
 * 
 * TODO spindraai en hawaiidraai moeten vervangen voor dynamysche methoden via risicoattractie
 */
package Piekenkermis;

public class MainPiekenKermis {
	

	
//======================================== MAIN
	public static void main(String[] args) {
	
	Kermis k = new Kermis();
	
		k.welkom();
	  
		int modus = k.kiesModus();

		while (true) {
			if ( k.kapnah == 1 ) {
			  modus = k.kiesModus();
			  k.kapnah = 0;
			}
			if ( 0 == modus ) {		//YODACODE!
				k.mainBezoeker();
			} else if ( 1 == modus ) {
				k.mainBeheerder();
			}
		}
	}// endofmain
	
//======================================== METHODEN	
	
}// endofMainPiekenKermis
