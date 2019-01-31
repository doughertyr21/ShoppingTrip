
public class BatElement extends RoomElement {
	public void handle() {
		System.out.println("You are teleported by bats!");
		int newRoom = WumpusGame.map.randomEmptyRoom();
		WumpusGame.currentRoomIndex = newRoom;
	}

	public void printSenses() {
		System.out.println("You hear flapping.");
	}
}
