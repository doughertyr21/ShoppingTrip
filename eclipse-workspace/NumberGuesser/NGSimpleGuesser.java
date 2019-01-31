
public class NGSimpleGuesser extends NGGuesser {
	
	public int lastGuess;
	
	public NGSimpleGuesser() {
		NGRandom ngr = new NGRandom();
		lastGuess = ngr.getRand();
	}
	
	public int nextGuess(String answer) {
		if (answer.equals("-")) {
			lastGuess = lastGuess -1;
			return lastGuess;
		} else if (answer.equals("+")) {
			lastGuess = lastGuess + 1;
			return lastGuess;
		} else
			return lastGuess;
	}

}
