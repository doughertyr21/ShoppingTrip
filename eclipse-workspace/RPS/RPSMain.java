import java.util.Scanner;

public class RPSMain {

	Scanner scan = new Scanner(System.in);
		
	public static final int PLAYER1_WINS = 1;
	public static final int PLAYER2_WINS = 2;
	public static final int TIE = 0;
	public static final int ERROR = -1;
	
	public static RPSPlayer p1;
	public static RPSPlayer p2;
		
	public static int randomInt(int max) {
		return(int)(Math.random() * max + 1);
		
	}
		
	public static boolean isValid(String s) {
		return s.equals("rock") || s.equals("paper") || s.equals("scissors");
	}
		
	public static int findWinner(String p1Choice, String p2Choice) {
		if (! isValid(p1Choice) || ! isValid(p2Choice))
			return ERROR;
		if (p1Choice.equals(p2Choice)) {
			return TIE;
				
		} else if (p1Choice.equals("rock")) {
			return (p2Choice.equals("paper") ? PLAYER2_WINS : PLAYER1_WINS);
				
		} else if (p1Choice.equals("paper")) {
			return (p2Choice.equals("scissors") ? PLAYER2_WINS : PLAYER1_WINS);
				
		} else {
			return (p2Choice.equals("rock") ? PLAYER2_WINS : PLAYER1_WINS);
		}
	}
		
	public static void printResults(int winner) {
		if (winner == PLAYER1_WINS) {
			System.out.println(p1.name + " wins!");
			p1.score = p1.score + 1;
				
		} else if(winner == PLAYER2_WINS) {
			System.out.println(p2.name + "wins!");
			p2.score = p2.score +1;
				
		} else if(winner == TIE) {
			System.out.println("It's a tie!");
				
		} else {
			System.out.println("Error!");
		}
	}
		
		
	public static void main(String[] args) {
		
		p1 = new RPSHuman("Name");
		p2 = new RPSComputer();
		for (int i = 1; i<= 3; i++) {
			String p1Choice, p2Choice;
			p1Choice = p1.choose();
			p2Choice = p2.choose();
			int winner = findWinner(p1Choice, p2Choice);
			printResults(winner);
		}
		
		System.out.println("Final Score: ");
		System.out.println(p1.name + " " + String.valueOf(p1.score));
		System.out.println(p2.name + "" + String.valueOf(p2.score));
		
		}
		
	}