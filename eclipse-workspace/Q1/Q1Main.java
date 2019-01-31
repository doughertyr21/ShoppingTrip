import java.util.Scanner;
public class Q1Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Which method would you like to use?");
		System.out.println("(1) Modulo");
		System.out.println("(2) Modulo w/ Parent");
		System.out.println("(3) Sum");
		String input = "";
		input = scan.nextLine();
		
		//System.out.println("Hello, world!");
		if (input.equals("1")) {
			Q1Op1 op1 =  new Q1Op1();
			
			System.out.println(op1.op(3,4,5));
			System.out.println(op1.op(2, 7, 13));
			System.out.println(op1.op(53, 2, 10));
			System.out.println(op1.op(1, 1, 1));
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(op1.op(i, 3, 4));
			}
			
		}
		
		if (input.equals("2")) {

			Q1OpParent op2 = new Q1Op1();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(op2.op(i, 3, 4));
			}
			
		}
		
		if (input.equals("3")) {
			Q1OpParent op3 = new Q1Op2();
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(op3.op(i,3,4));
			}
		}
		
	}

}
