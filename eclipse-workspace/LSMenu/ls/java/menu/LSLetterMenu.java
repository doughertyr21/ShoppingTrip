package ls.java.menu;

// displays a menu where user chooses via first letter of each item,
// with the assumption (currently) that every item has a different letter
public class LSLetterMenu extends LSMenu {
	
	public LSLetterMenu(String title) {
		super(title);
	}
	
	void displayMenuItem(int i) {
		System.out.println("(" + menu [i].getItemString().charAt(0) + ")" +
	          menu[i].getItemString().substring(1));
		
	}
	//wrote this code on accident, not sure if it'll ever be used
	
	//void useSingleLine(int i) {
	//	System.out.println("(" + menu [i].getItemString().charAt(0) + ")" + 
	//			menu[i].getItemString().substring(1) + 
	//			"(" + menu [i + 1].getItemString().charAt(0) + ")" + 
	//			menu[i + 1].getItemString().substring(1) + ")" ) ;
	//}
	
	int lookupMenuItem(String s) {
		char c = s.charAt(0);
		for (int i = 0; i < nItems; i++) {
			if (menu[i].getItemString().charAt(0) == c)
				return i + 1;
		}
			return MENU_ITEM_ERROR;
		
	}

}
