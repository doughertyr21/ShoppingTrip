// Ryan Dougherty Number Guesser Exercise
// I added the random guesser and the play again feature

import java.util.Scanner;
public class NGMain {

	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to Number Guesser! Think of a number between 1 and 100.");
			String answer = "";
			String playAgain = "";
			NGGuesser guesser = new NGRandom();
			Scanner myScanner = new Scanner(System.in);
			do {
				do {
					int guess = guesser.nextGuess(answer);
					System.out.println("My guess is " + guess);
					answer = myScanner.next();
					
				} while(! answer.equals("="));
				System.out.println("I guessed it!");
				System.out.println("Do you want to play again? y/n");
				playAgain = myScanner.next();
				// put two lines of code here to ask if
				// play again and get answer
			} while (playAgain.equals("y"));
	}

}
