import java.util.Random;
public class NGRandom extends NGGuesser {
	int upper = 100;
	int lower = 1;
	int lastGuess = 50;
	Random rand = new Random();
	
	public int nextGuess(String answer) {
/*
		if (answer.equals("-")) {
			lastGuess = lastGuess -1;
			return lastGuess;
		} else if (answer.equals("+")) {
			lastGuess = lastGuess + 1;
			return lastGuess;
		} else
			return lastGuess;
*/
		if(answer.equals("-")) {
			upper = lastGuess - 1;
		} else if (answer.equals("+")) {
			lower = lastGuess +1;
		} else
			return lastGuess;
		lastGuess = rand.nextInt(upper - lower) + lower;
		return lastGuess;
	}
}
