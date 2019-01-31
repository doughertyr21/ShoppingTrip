
public class RPSHuman extends RPSPlayer {

	public RPSHuman(String s) {
		System.out.println("Please enter your name.");
		name = scan.next();
		
	}
	
	public String choose() {
		do {
			String input;
			System.out.println("Your choice:");
			input = scan.next();
			
			if (RPSMain.isValid(input)) {
				if (input.equals("rock")) {
					printRock();
				}
				else if (input.equals("paper")) {
					printPaper();
				}
				else if (input.equals("scissors")) {
					printScissors();
				}
				return input;
			}
			else {
				System.out.println("Please enter rock, paper, or scissors.");
			}
		} while (true);
	}
	
}
