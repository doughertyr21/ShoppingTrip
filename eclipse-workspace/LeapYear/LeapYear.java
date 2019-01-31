import java.util.Scanner;
public class LeapYear {
	static Scanner scan = new Scanner(System.in);
	static boolean active = true;
	public static void isLeapYear() {
		while (active == true) {
			System.out.println("Please input a year.");
			System.out.println("Use the year 0 to end.");
			int year = scan.nextInt();
			int div4 = year % 4;
			int div100 = year % 100;
			int div400 = year % 400;
			if(year == 0) {
				active = false;
			}
			if(div400 != 0) {
				
				if(div4 != 0) {
					System.out.println("Your year is not a leap year.");
					
					if (div100 == 0) {
						System.out.println("Your year is not a leap year.");
						
					}
				}
				if(div4 == 0) {
					if (div100 == 0) {
						System.out.println("Your year is not a leap year.");
						
					}
					else {
						System.out.println("Your year is a leap year.");
					}
				}
			}
			if(div400 == 0) {
				System.out.println("Your year is a leap year.");
					}
				}
		}
		
	public static void main(String[] args) {
		//uses user input instead of set values
		isLeapYear();
	}

}
