
public class PotionElement extends RoomElement {
	public void handle() {
		if (WumpusGame.hasPotion == false) {
			System.out.println("A dusty bottle with a colorful liquid lays on the ground.");
			System.out.println("Would you like to drink it? (y/n)");
			String potionChoice = WumpusGame.readLine("> ");
			if (potionChoice.startsWith("y")) {
				WumpusGame.hasPotion = true;
				if (WumpusGame.potionType == 0) {
					//this potion type will end up killing you, but in total it's only a 1/3 chance
					System.out.println("The brew tastes like almonds. You feel your insides shake as you fall unconscious...");
					WumpusGame.gameActive = false;
				}
				else if (WumpusGame.potionType == 1) {
					//this potion is
					//unfinished
					//was planning on making it so you could more accurately see the location of the wumpus or other things
					System.out.println("The tasteless brew fills your brain with a feeling of ecstacy. The world becomes more vivid.");
					WumpusGame.sensesBuff = true;
				}
				else if (WumpusGame.potionType == 2) {
					//this potion will give you altered vision, allowing you to find and use a secret room to win
					System.out.println("Drinking the brew gives you a pounding headache. Your vision becomes tainted with a red hue.");
					WumpusGame.alteredVision = true;
				}
			}
			if (potionChoice.startsWith("n")) {
				System.out.println("You leave the bottle on the ground.");
			}
		}
	}
	public void printSenses() {
		//the potion room doesn't show you where it is, this is intentional since it's supposed to be a cool find
		
	}

}
