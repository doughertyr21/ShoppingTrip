/*/import java.util.Scanner;

public class RPSOldMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RPSComputerPlayer computer = new RPSComputerPlayer();
		
		boolean repeat = true;
		String input = "";
		do {
			do {
				write("What would you like to cast? (r,p,s)");
				input = scan.next();
			
			}
			while(!(input.equals("r") || input.equals("p") || input.equals("s"))); 
			int humanMove;
			if (input.equals("r")) {
				write("  ======");
				write("==========");
				write("===rock===");
				write("==========");
				write("  ======");
				write("");
				humanMove = 0;
			}
			else if (input.equals("p")) {
				write("___________");
				write("|         |");
				write("|         |");
				write("|  paper  |");
				write("|         |");
				write("|         |");
				write("-----------");
				write("");
				humanMove = 1;
			}
			else {
				write("O      /");
				write(" \\    /");
				write("  \\  /");
				write("   \\/");
				write("   /\\");
				write("  /  \\");
				write(" /    \\");
				write("O      \\");
				write("");
				humanMove = 2;
			}
			
			int computerMove= computer.generateMove();
			
			if(computerMove == 0) {
				write("  ======");
				write("==========");
				write("===rock===");
				write("==========");
				write("  ======");
				write("computer cast rock");
				
			}
			else if(computerMove == 1) {
				write("___________");
				write("|         |");
				write("|         |");
				write("|  paper  |");
				write("|         |");
				write("|         |");
				write("-----------");
				write("computer cast paper");
			}
			else {
				write("O      /");
				write(" \\    /");
				write("  \\  /");
				write("   \\/");
				write("   /\\");
				write("  /  \\");
				write(" /    \\");
				write("O      \\");
				write("computer cast scissors");
			}
			if(humanMove == computerMove) {
				write ("It's a tie!");
				continue;
			}
			if((humanMove + 2)%3 == computerMove) {
				write("Human wins");
			}
			else {
				write("Computer wins");
			}
	}
	while (repeat);
		
	scan.close();
	}
	
	public static void write(String s) {
		System.out.println(s);
	}

}
/*/