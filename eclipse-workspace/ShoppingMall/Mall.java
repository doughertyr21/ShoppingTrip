import java.util.ArrayList;
import java.util.Scanner;

public abstract class Mall extends ShoppingTrip {
	static Scanner scan = new Scanner(System.in);
	ArrayList<Store> stores;
	
	public static void chooseMall() {
		String input = "";
		System.out.println("Please choose a mall. (enter number for mall)");
		System.out.println("1. Small Mall");
		System.out.println("2. Medium Mall");
		System.out.println("3. Big Mall");
		input = scan.nextLine();
		
		switch(input) {
		case "1": 
			mall = 1;
			mallName = "Small Mall";
			break;
		case "2":
			mall = 2;
			mallName = "Medium Mall";
			break;
		case "3":
			mall = 3;
			mallName = "Big Mall";
			break;
			
		
			
		}

	}
	

}
