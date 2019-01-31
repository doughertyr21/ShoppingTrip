package ls.java.menu;

public class LSRomanMenu extends LSMenu {
	String rv = "I";
	public LSRomanMenu(String title) {
		super(title);
	}

	void displayMenuItem(int i) {
		if (i == 0) {
			System.out.println("I" + ")" + menu[i].getItemString());
		}
		if (i == 1) {
			System.out.println("II" + ")" + menu[i].getItemString());
		}
		if (i == 2) {
			System.out.println("III" + ")" + menu[i].getItemString());
		}
			
		
	}
	
}
