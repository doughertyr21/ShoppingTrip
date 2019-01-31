package ls.java.menu;

import java.util.Scanner;
public class LSMenu {
	public static final int MAX_ITEMS = 10;
	public static final int MENU_ITEM_ERROR = -1;
	
	String menuTitle = "Choose: ";
	LSMenuItem[] menu = new LSMenuItem[MAX_ITEMS];
	int nItems = 0;
	Scanner scan = new Scanner(System.in);
	
	public LSMenu(String title) {
		menuTitle = title;
	}
	
	public void addItem(String s ) {
		if (nItems == MAX_ITEMS) {
			System.out.println("Menu overflow");
			return;
		}
		menu[nItems] = new LSMenuItem(s);
		nItems++; // same as nItems = nItems + 1
	}
	
	void displayMenuItem(int i) {
		System.out.println(( i + 1) + ") " + menu [i].getItemString());
	}
	
	void useSingleLine(int i) {
		System.out.println((i + 1) + ") " + menu[i].getItemString() +
				(i + 2) + ") " + menu[i+1].getItemString() +
				(i + 3) + ") " + menu[i +2].getItemString());
	}
 	
	int lookupMenuItem(String s) {
		int choice = Integer.valueOf(s);
		if (choice > 0 &&  choice <= nItems)
			return choice;
		else
			if (String.valueOf(choice) == "I")
				return choice;
			if (String.valueOf(choice) == "II")
				return choice;
			if (String.valueOf(choice) == "III")
				return choice;
			else
				return MENU_ITEM_ERROR;
	}
	
	public int displayAndChoose() {
		boolean valid = false;
		int choice;
		do {
			System.out.println(menuTitle);
			// uncomment/comment below  3 or comment/uncomment "useSingleLine" if using seperate lines or roman numerals, switch
			// NOTE: was not able to get roman to take actual I's as input, still just numbers. might see code from that around.
			for (int i = 0; i < nItems; i++) {
				displayMenuItem(i);
			}
			//useSingleLine(0);
			System.out.println(": ");
			String input = scan.next();
//			if (input == "I") {
//				String input = String.valueOf(1);
//			}
//			if (input == "II") {
//				String input = String.valueOf(2);
//			}
//			if (input == "III") {
//				String input = String.valueOf(3);
//			}
//			
			choice = lookupMenuItem(input);
			valid = (choice != MENU_ITEM_ERROR);
		} while (! valid);
		return choice;
	}
}
