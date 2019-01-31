
public class ArrowElement extends RoomElement {
	public void handle() {
		if (WumpusGame.arrowActive == false) {
			System.out.println("All that's left is the broken off tip of an arrow.");
		}
		if (WumpusGame.arrowActive == true) {
			System.out.println("You find a pile of arrow buried in a pile of rubble.");
			if (WumpusGame.arrowCount == 10) {
				System.out.println("Your quiver is full and cannot fit any more arrows.");
			}
			WumpusGame.arrowCount = 10;
			System.out.println("You now have " + WumpusGame.arrowCount + " arrows.");
			WumpusGame.arrowActive = false;
		}
		
	}
	public void printSenses() {
		System.out.println("You can see something shiny in the distance.");
	}

}
