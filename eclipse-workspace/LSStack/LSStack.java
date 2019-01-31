import java.util.ArrayList;
import java.util.Scanner;
public class LSStack {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Float> stack = new ArrayList<Float>();
	
	public static void print() {
		System.out.println(stack.get(0));
	}
	
	public static void pop() {
		stack.remove(0);
		
	}
	
	public static void push(float f) {
		stack.add(0,(float) f );
	}

	public static void main(String[] args) {
		push(1);
		print();
		push(2);
		print();
		pop();
		print();
		

	}

}
