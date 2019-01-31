package ls.java;
import ls.java.menu.*;

public class LSMenuMain {

	public static void main(String[] args) {
		//LSMenu myMenu = new LSLetterMenu("Choose one: ");
		LSMenu myMenu = new LSRomanMenu("Choose one: ");
		myMenu.addItem("rock ");
		myMenu.addItem("paper ");
		myMenu.addItem("scissors ");
		int choice = myMenu.displayAndChoose();
		System.out.println("Choice = " + choice);
		
	}

}
