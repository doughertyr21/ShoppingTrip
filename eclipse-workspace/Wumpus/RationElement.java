
public class RationElement extends RoomElement {
	public void handle() {
		if (WumpusGame.rationActive == false) {
			System.out.println("The box of rations is empty.");
		}
		if (WumpusGame.rationActive == true) {
			System.out.println("A box of rations sits in the corner of the room.");
			System.out.println("Hunger increased by 10!");
			WumpusGame.hunger = WumpusGame.hunger +10;
			WumpusGame.rationActive = false;
		}
	}
	public void printSenses() {
		System.out.println("You can smell what seems to be stale bread.");
	}

}
