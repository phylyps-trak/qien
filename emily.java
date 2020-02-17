// Mastermind by EmiLee 
import java.util.Random;
import java.util.Scanner;
public class emily {
    public static void main(String[] args) {
    	Game game = new Game();
    	game.welcomeMessage();
    	game.RandomCode();
    	game.userInput();
    	game.checkUserInput();
   	} 
} 
class Game{
	public char[] secretCode = new char[4]; 
	public char [] userCode = new char[4]; 
	public boolean gameOn = true; 
	public int correctCount = 0;
	public char abcdef;
    public void RandomCode () { 
    	for(int i = 0; i < secretCode.length; i++) {
    	Random r = new Random();
    	abcdef = (char)(r.nextInt(6) + 'a');
    	secretCode[i] = abcdef;
    	System.out.print(abcdef); 
    	}
    } 
    public void userInput () { 
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your 4 letters");
    	String input = scanner.next();
    	  	if(input.contentEquals("ESC")) { 
    		gameOn = false;                  
    		System.out.println("You pressed ESC, your code was: " + secretCode[0] + secretCode[1] + secretCode[2] + secretCode[3] + ". Thank you for playing.");  
    	  	}
    	  	else if(input.length() < userCode.length || input.length() > userCode.length) {
    	  		System.out.println("Whoops, you have entered "+ input.length() + " letters. Please enter 4 letters.");
    	  		System.out.println("");
    	  		userInput();
    	  	}
    	  	else {
    	  	for(int i = 0; i<secretCode.length; i++) {
    	  	userCode[i] = input.charAt(i);
    	  		}
    	  	}
        }
    public void checkUserInput() {
    	while(gameOn) {
    	correctCount = 0;
    	for (int i = 0; i < secretCode.length; i++) {
    			if(secretCode[i] == userCode[i]) {
    				correctCount++;
    		}
    	}
    	if(correctCount == secretCode.length) {
    		System.out.println("You guessed "+ correctCount + " correct. You won!");
    		gameOn = false;
    	}else if (correctCount == (secretCode.length -1)) {
    		System.out.println("You guessed " + correctCount + " correct. Almost there.");
    		System.out.println("");
    		userInput();
    		checkUserInput();
    	}else {
    		System.out.println("You guessed "+ correctCount + " correct. Keep on trying.");
    		System.out.println("");
    		userInput();
    		checkUserInput();
    	}
     }    
   }
     public void welcomeMessage() {
	  System.out.println("************************************************************");
	  System.out.println("Welcome to Mastermind");
	  System.out.println("Your goals is to guess a secret code consisting of 4 letters");
	  System.out.println("You can pick 4 letters from a, b, c, d, e, f");
	  System.out.println("You can write ESC if you want to quit");
	  System.out.println("Have fun and good luck!");
	  System.out.println("************************************************************");
  	} 
 }