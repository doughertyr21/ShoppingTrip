
public class RPSPlayer extends RPSMain {
	int score = 0;
	String name;
	
	protected RPSPlayer() {}
	
	public String choose() {return "";}

	public void printRock() {
		System.out.println("  ======");
		System.out.println("==========");
		System.out.println("===rock===");
		System.out.println("==========");
		System.out.println("  ======");
		System.out.println("");
	}
	
	public void printPaper() {
		System.out.println("___________");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("|  paper  |");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("-----------");
		System.out.println("");
	}
	
	public void printScissors() {
		System.out.println("O      /");
		System.out.println(" \\    /");
		System.out.println("  \\  /");
		System.out.println("   \\/");
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println("O      \\");
		System.out.println("");
	}
}
