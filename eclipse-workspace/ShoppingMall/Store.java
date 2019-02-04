import java.util.ArrayList;

public class Store {
	String storeName;
	ArrayList<Item> items;
	int floor;
	int roomNumber;
	
	public void enterStore() {
		System.out.println("Welcome to " + storeName + "!" );
		System.out.println("We have many things for sale, such as:");
		for (int i = 1; i <= items.size(); i++) {
			System.out.println(items.get(i));
		}
		
	}

}
