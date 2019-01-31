
public class EscapeElement extends RoomElement {
	public void handle() {
		if (WumpusGame.alteredVision == true) {
			System.out.println("You can see the outline of a metallic square highlighted bright red on the ceiling.");
			System.out.println("You pull away the vines covering it from normal vision. Pulling it open drops down a rope ladder.");
			System.out.println("The light from above shines down, illuminating the room with sunlight for the first time.");
			System.out.println("You escape. Victory!!!");
			WumpusGame.gameActive = false;
		}
	}
	public void printSenses() {
		if (WumpusGame.alteredVision == true) {
			System.out.println("You see a faint red glow in the distance.");
		}
	}
}
