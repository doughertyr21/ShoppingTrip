
public class PitElement extends RoomElement {
	public void handle() {
		System.out.println("You fall into a bottomless pit!");
		WumpusGame.gameActive = false;
	}
	
	public void printSenses() {
		System.out.println("You feel a draft.");
	}
}
