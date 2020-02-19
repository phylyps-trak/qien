package Mastermind;
public class SpelVerloop{

	//=================			//INTRO hahah lekker ascii klooien, heerlijk
			void welkom() {
				System.out.println("######################################");
				System.out.println("    Welkom bij MASTERMIND superieur");
				System.out.println("  ----------------------------------- ");
				System.out.println(" |   Het bekroonde spel voor de      |");
				System.out.println(" |   professionele codebrekers       |");
				System.out.println(" |     Le jeu champion pour les      |");
				System.out.println(" |     professionels du decodage     |");
				System.out.println("    -------------------------------   ");
				System.out.println(" |   met 5 gaten en 8 kleuren        |");
				System.out.println(" |     avec 5 cases et 8 couleurs    |");
				System.out.println("  ----------------------------------- ");
				System.out.println("                                      ");
				System.out.println(" ------ Spel van het jaar 1975! ------");
				System.out.println("######################################");
				System.out.println("\n");
			}//endofwelkom

	//==========				//extra methodetje om de gevulde codearray netjes te laten zien
			void laatCodeZien( String[] codeArray){
				System.out.println("   [de geheime code]");
				System.out.println("  -------------------");
				for(int a = 0 ; a < codeArray.length ; a++ ){
					System.out.print(" | " + codeArray[a] );
				}
				System.out.print(" |");
				System.out.println(" ");			
				System.out.println("  -------------------");

			}//endof laatCodeZien
	//==========
			void eersteBeurt() {
				//eerste beurt

				System.out.println("\n...en nu jij, raden maar!  (format: x,x,x,x,x)");
				System.out.println("=======================");
			}
		}//endofSpelVerloop
