/* class WumpusGame -- main game class; provides main loop and some utilities.  */
//
// List of additions
// - added arrow count
// - added place to fill quiver
// - added hunger, you die when you run out, lose hunger when completing an action, warned when low on hunger
// - added a room to gain extra hunger points
// - added difficulty options, changes starting hunger and starting arrows
// - added the ability to shoot bats, you can't kill all the bats to prevent them from teleporting you,
//   but you can shoot them as food (effectively turn arrows to hunger)
// - added a potion element, three possible options if you choose to drink the potion, see element class
// - added another a way to win from potion element through a secret escape element
//
import java.io.*;

public class WumpusGame {

	public static WumpusMap map = new WumpusMap();
	public static boolean gameActive = true;
	public static boolean rationActive = true;
	public static boolean arrowActive = true;
	public static boolean hasPotion = false;
	public static boolean sensesBuff = false;
	public static boolean alteredVision = false;
	
	public static int currentRoomIndex = 1;
	public static int arrowCount = 5;
	public static int hunger = 20;
	public static int potionType = (int) (Math.random() *3);
	
	// special i/o method required because Eclipse does not provide a Console object
	// changed to static so an element could view
	static String readLine(String prompt) {
	        String line = null;
	        Console c = System.console();
	        if (c != null) {
	             line = c.readLine(prompt);
	        } else {
	            System.out.print(prompt);
	            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	            try {
	                 line = bufferedReader.readLine();
	            } catch (IOException e) { 
	                //Ignore    
	            }
	        }
	        return line;
	 }

	
	public static void shootArrow(String input) {
	   	 // parse shoot command and error out if invalid syntax
	   	 int spacePos = input.indexOf(' ');
	   	 if (spacePos == -1 || spacePos == input.length() - 1) {  // bad shoot command syntax
	   		 System.out.println("Huh?");
	   		 return;
	   	 }

	   	 // command has valid syntax; check that shot is aimed in a valid direction and at a valid room
	   	 String direction = input.substring(spacePos + 1);  
	   	 int dirNum = WumpusMap.directionNumber(direction);
	   	 WumpusRoom room = currentRoom();
	   	 WumpusRoom targetRoom = null;
	   	 if (dirNum == 0) {
	   		 System.out.println("Huh?"); // bad shoot direction (not n, e, s, w or north, south, etc.)
	   		 return;   		 
	   	 }
	   	 if ((targetRoom = room.roomInDirection(dirNum)) == null) {
	   		 System.out.println("Can't fire that way.");  // direction is valid but doesn't point to a room
	   		 return;
	   	 }
	   	 
	   	 // at this point we know shoot command has valid syntax and is targeted at a valid room
	   	 if (targetRoom.getElement() != null && (targetRoom.getElement() instanceof WumpusElement)) {
	   		 System.out.println("You shoot the wumpus.  Victory!!");
	   		 gameActive = false;
	   	 }
	   	 if (targetRoom.getElement() != null && (targetRoom.getElement() instanceof BatElement)) {
			 System.out.println("You manage to hit a bat out of the air. Looks tasty.");
			 hunger = hunger +3;
			 System.out.println("Hunger increased by 3!");
			 arrowCount = arrowCount -1;
			 System.out.println("You now have " + arrowCount + " arrows.");
	   		 if (arrowCount == 0) {
	   			 System.out.println("You ran out of arrows and were eaten by the wumpus!");
	   			 gameActive = false;
	   		 }
	   	 }
	   	 else {
	   		 System.out.println("You missed and scared the wumpus.");
	   		 arrowCount = arrowCount -1;
	   		 hunger = hunger -1;
	   		 System.out.println("You now have " + arrowCount + " arrows.");
	   		 if (arrowCount == 0) {
	   			 System.out.println("You ran out of arrows and were eaten by the wumpus!");
	   			 gameActive = false;
	   		 }
	   		 map.moveWumpus();
	   	 }
	   	 
	    }
	
	public static WumpusRoom currentRoom() {
		return map.getRoom(currentRoomIndex);
	}
	
	public static void main(String[] args) {
		
		map.addElement(new WumpusElement());
		map.addElement(new PitElement());
		map.addElement(new PitElement());
		map.addElement(new BatElement());
		map.addElement(new BatElement());
		map.addElement(new ArrowElement());
		map.addElement(new RationElement());
		map.addElement(new PotionElement());
		map.addElement(new EscapeElement());
		
		currentRoomIndex = map.randomEmptyRoom();
		
		System.out.println("Welcome. Please choose difficulty:");
		System.out.println("Easy(e), Medium(m), Hard(h)");
		String gameDifficulty = readLine("> ");
		if (gameDifficulty.startsWith("e")) {
			arrowCount = 10;
			hunger = 30;
			System.out.println("Game difficulty set to easy.");
		}
		else if (gameDifficulty.startsWith("m")) {
			System.out.println("Game difficulty set to medium.");
		}
		else if (gameDifficulty.startsWith("h")) {
			arrowCount = 3;
			hunger = 10;
			System.out.println("Game difficulty set to hard.");
		}
		
		do  {
			map.getRoom(currentRoomIndex).printInfo();
			String userInput = readLine("> ");			
			int direction = 0;
			if (userInput.startsWith("shoot")) {
				shootArrow(userInput);
			} else if ((direction = WumpusMap.directionNumber(userInput)) != 0) {
				WumpusRoom nowRoom = map.getRoom(currentRoomIndex);
				WumpusRoom targetRoom = nowRoom.roomInDirection(direction);
				if (targetRoom != null) {
					currentRoomIndex = targetRoom.getIndex();
					hunger = hunger -1;
					targetRoom.handleElement();
				} else {
					System.out.println("You can't move in that direction.");
				}
			} else if (userInput.equals("bye")) {
				gameActive = false;
			} else {
				System.out.println("Command not understood.");
			}
		} while (gameActive);
		System.out.println("GAME OVER");
	}

}
