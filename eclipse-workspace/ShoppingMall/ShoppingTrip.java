

public class ShoppingTrip {
	static int shopper;
	static String shopperName;
	static int mall;
	static String mallName;
	

	public static void main(String[] args) {
		Mall.chooseMall();
		Shopper.chooseShopper();
		System.out.println("Welcome, " + shopperName + ", to the " + mallName + "!");
		
		switch(shopper) {
		case 1:
			PoorShopper.setBalance();
		case 2:
			AverageShopper.setBalance();
		case 3:
			RichShopper.setBalance();
			
		System.out.println(shopper);
		System.out.println("Your balance is: $" + Shopper.balance);
		
		}

	}

}
