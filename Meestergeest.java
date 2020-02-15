
	
/*
 * Michiel Janssens
 * 12/02/2020
 * MASTERMIND
 * 
 * 
 */
import java.util.Random;
public class Meestergeest {
	public static void main(String[] args) {
	//welkom
			System.out.println("######################################");
			System.out.println("#  welkom bij een potje ouderwetsch  #");
			System.out.println("#           MASTERMIND	!            #");
			System.out.println("# kraak jij de code van de computer? #");
			System.out.println("######################################\n\n");

			CodeRobot cg1 = new CodeRobot();
			
			cg1.setCode();
			cg1.setCode2();
			cg1.setCode3();
			/*
			System.out.println("DEBUG2");
			System.out.println(cg1.codep1);
		*/

			// TODO input speler 1 karakter
			// scanner importeren
			// Speler vragen om input

			// TODO print ze allebei op het scherm

			// TODO GOOGLEN hoe je ze vergelijk, de karakters
			// check of dat ja of nee is
			// TODO punt geven als gelijk

			// TODO geen punt als i goed

			// =================
			// nu proberen met twee karakters computer code
			// met if statement & for loop

		}// endofmain

	
	
		//TODO code van 1 genereren uit BAK van zes
static class CodeRobot {
	// initializer block
		{
			System.out.println("dit is de coderobot");
			System.out.println("-------------------\n");
		}
// FIELD voor de code

//ARRAY met mogelijkheden voor code
	//private char[] codeOpties = {'A', 'B', 'C', 'D', 'E', 'F'};

//SETTER METHOD 
	public char setCode() {
		Random r = new Random();
		char val = (char)(r.nextInt(7) + 'a');
		char codep1 = val;
		System.out.println(" DEBUG: hier met die fucking letter!");
		System.out.println(codep1 + "\n" );
		return codep1;
	}//endofsetCode
	
	
//NEW METHOD for RANDOM CHAR
	public void setCode2() {
	String chars = "abcdef";
	Random rnd = new Random();
	char p1 = chars.charAt(rnd.nextInt(chars.length()));
	char p2 = chars.charAt(rnd.nextInt(chars.length()));
	char p3 = chars.charAt(rnd.nextInt(chars.length()));
	char p4 = chars.charAt(rnd.nextInt(chars.length()));
	System.out.println(" DEBUG2: hier met die fucking letter!");
	System.out.println(p1 + " " + p2 + " " + p3 + " " + p4 + "\n" );
	}
	
//OTHER METHOD FOR RANDOM STRING FROM ARRAY
	public void setCode3() {
	String[] arr={"sjors", "michiel", "kevin", "benjamin", "felix"};
    Random r=new Random();
    int randomNumber=r.nextInt(arr.length);
    System.out.println(arr[randomNumber]);
	}
//GETTER method
//	public static char getCode() {

//	}

 OPTIE 1
    private Random rand = new Random();

    public char getRandArrayElement(){
        return codeOpties[rand.next(codeOpties.length)];
        					//next werkt niet op char
    }	
*/
			
}// endofcoderobot
}// endofmeestergeest
