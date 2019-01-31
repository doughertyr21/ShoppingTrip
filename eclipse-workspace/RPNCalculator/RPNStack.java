import java.util.ArrayList;

public class RPNStack {
	ArrayList<RPNStackItem> stack = new ArrayList<RPNStackItem>();
	
	void push(RPNStackItem item) {
		stack.add(0, item);
	}
	
	RPNStackItem pop() {
		return stack.remove(0);
	}
	
	void printStack() {
		for (RPNStackItem i : stack) {
			System.out.println(i);
		}
	}
}