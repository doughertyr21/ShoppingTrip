import java.util.ArrayList;

public class VRPNStack {
	public ArrayList<VRPNStackItem> stack = new ArrayList<VRPNStackItem>();
	
	public void push(VRPNStackItem i) {
		stack.add(0, i);
	}
	
	VRPNStackItem pop() {
		return stack.remove(0);
	}
	
	VRPNStackItem get(int x) {
		return stack.get(x);
	}
	
	void printStack() {
		for (VRPNStackItem i : stack) {
			System.out.println(i);
		}
	}

}
