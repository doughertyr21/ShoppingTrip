import java.util.ArrayList;
import java.util.Scanner;

public abstract class Shopper extends ShoppingTrip {
	static Scanner scan = new Scanner(System.in);
	static double balance;
	ArrayList<Item> cart;
	
	public static void chooseShopper() {
		String input = "";
		System.out.println("Please select a shopper. (enter number for shopper)");
		System.out.println("1. Poor Shopper");
		System.out.println("2. Average Shopper");
		System.out.println("3. Rich Shopper");
		input = scan.nextLine();
		
		switch(input) {
		case "1": 
			shopper = 1;
			shopperName = "Poor Shopper";
			break;
		case "2":
			shopper = 2;
			shopperName = "Average Shopper";
			break;
		case "3":
			shopper = 3;
			shopperName = "Rich Shopper";
			break; 
		}
	}
	

}
