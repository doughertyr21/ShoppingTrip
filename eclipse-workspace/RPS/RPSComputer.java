
public class RPSComputer extends RPSPlayer {
	public RPSComputer() {
		name = "Computer ";
	}
	public int random() {
		
		return(int)(Math.random() *3);
		
		}
	
	public String choose() {
		int r = random();
		if(r == 0) {
			printRock();
			System.out.println(name + "chooses rock.");
			return "rock";
		}
		
		if(r == 1) {
			printPaper();
			System.out.println(name + "chooses paper.");
			return "paper";
		}
		
		if (r == 2) {
			printScissors();
			System.out.println(name + "chooses scissors.");
			return "scissors";
		}
		return name;
		
	}
	
	}
	